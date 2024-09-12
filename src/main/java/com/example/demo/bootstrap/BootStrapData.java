package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        partRepository.deleteAll();
        outsourcedPartRepository.deleteAll();

        OutsourcedPart whiteLace = new OutsourcedPart();
        whiteLace.setId(1);
        whiteLace.setInv(20);
        whiteLace.setName("White Laces");
        whiteLace.setPrice(5.00);
        whiteLace.setCompanyName("Lace Co.");
        whiteLace.setMaxInv(30);
        whiteLace.setMinInv(5);

        OutsourcedPart blackLace = new OutsourcedPart();
        blackLace.setId(2);
        blackLace.setInv(20);
        blackLace.setName("Black Laces");
        blackLace.setPrice(5.00);
        blackLace.setCompanyName("Lace Co.");
        blackLace.setMaxInv(30);
        blackLace.setMinInv(5);

        OutsourcedPart h4CoilerBoa = new OutsourcedPart();
        h4CoilerBoa.setCompanyName("Boa");
        h4CoilerBoa.setId(3);
        h4CoilerBoa.setInv(25);
        h4CoilerBoa.setName("H4 Coiler Boa");
        h4CoilerBoa.setPrice(0);
        h4CoilerBoa.setMaxInv(50);
        h4CoilerBoa.setMinInv(10);

        OutsourcedPart m2Boa = new OutsourcedPart();
        m2Boa.setCompanyName("Boa");
        m2Boa.setId(4);
        m2Boa.setInv(25);
        m2Boa.setName("M2 Boa");
        m2Boa.setPrice(0);
        m2Boa.setMaxInv(50);
        m2Boa.setMinInv(10);

        OutsourcedPart boaCable = new OutsourcedPart();
        boaCable.setCompanyName("Boa");
        boaCable.setId(5);
        boaCable.setInv(100);
        boaCable.setName("Boa Cable");
        boaCable.setPrice(0);
        boaCable.setMaxInv(150);
        boaCable.setMinInv(25);

        outsourcedPartRepository.save(whiteLace);
        outsourcedPartRepository.save(blackLace);
        outsourcedPartRepository.save(h4CoilerBoa);
        outsourcedPartRepository.save(m2Boa);
        outsourcedPartRepository.save(boaCable);

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        Product laceBoot = new Product("Lace Boot", 249.95,15);
        Product softBoa = new Product("Soft Boa Boot",299.95,20);
        Product softDoubleBoaBoot = new Product("Soft Double Boa Boot",349.95,25);
        Product stiffBoaBoot = new Product("Stiff Boa Boot",324.99,15);
        Product stiffDoubleBoaBoot = new Product("Stiff Double Boa Boot",374.95,20);

        productRepository.deleteAll();

        productRepository.save(laceBoot);
        productRepository.save(softBoa);
        productRepository.save(softDoubleBoaBoot);
        productRepository.save(stiffBoaBoot);
        productRepository.save(stiffDoubleBoaBoot);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
