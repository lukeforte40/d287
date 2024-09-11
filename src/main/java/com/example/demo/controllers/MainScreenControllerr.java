package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 *
 *
 *
 */

@Controller
public class MainScreenControllerr {
   // private final PartRepository partRepository;
   // private final ProductRepository productRepository;'
    @Autowired
    private ApplicationContext context;


    private PartService partService;
    private ProductService productService;

    private List<Part> theParts;
    private List<Product> theProducts;

    private String Message = "Unable to purchase.";
 /*   public MainScreenControllerr(PartRepository partRepository, ProductRepository productRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
    }*/

    public MainScreenControllerr(PartService partService,ProductService productService){
        this.partService=partService;
        this.productService=productService;
    }
    @GetMapping("/mainscreen")
    public String listPartsandProducts(Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){
        //add to the sprig model
        List<Part> partList=partService.listAll(partkeyword);
        theModel.addAttribute("parts",partList);
        theModel.addAttribute("partkeyword",partkeyword);
    //    theModel.addAttribute("products",productService.findAll());
        List<Product> productList=productService.listAll(productkeyword);
        theModel.addAttribute("products", productList);
        theModel.addAttribute("productkeyword",productkeyword);
        return "mainscreen";
    }
    @GetMapping("/buyNow")
    public String buyNow(@RequestParam("productID") int theId, Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword) {
        
        ProductService repo = context.getBean(ProductServiceImpl.class);
        Product product = repo.findById(theId);
        if (product.getInv() > 0) {
            product.setInv(product.getInv() - 1);
            List<Part> partList=partService.listAll(partkeyword);
            theModel.addAttribute("parts",partList);
            theModel.addAttribute("partkeyword",partkeyword);
            List<Product> productList=productService.listAll(productkeyword);
            theModel.addAttribute("products", productList);
            theModel.addAttribute("productkeyword",productkeyword);
            theModel.addAttribute("message", Message);
            Message = "Purchase Success";
            return "mainscreen";
        }
        else{
            List<Part> partList=partService.listAll(partkeyword);
            theModel.addAttribute("parts",partList);
            theModel.addAttribute("partkeyword",partkeyword);
            List<Product> productList=productService.listAll(productkeyword);
            theModel.addAttribute("products", productList);
            theModel.addAttribute("productkeyword",productkeyword);
            theModel.addAttribute("message", Message);
            return "mainscreen";    
        }
    }
}
