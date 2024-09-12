B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

    This File.

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

    Shop Name - mainscreen.html line 14 and 19. Changed the shop name from "shop" to "snowboard boot shop" and title from "my bike shop" to "my snowboard boot shop"
    Products Name - mainscreen.html line 54. Changed "Products" to "Boots".
    Parts Name- mainscreen.html line 22. Changed "Parts" to "Boot Parts".

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

    About page - about.html whole document added about page to the project.
    navigation between main page and about page- about.html line 18, mainscreen.html line 20 added navigation between home page and about page with a tag.

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

    Products - BootStrapData.java line 93-106. Added Products: Lace Boot, Soft Single Boa, Soft Double Boa, Stiff Single Boa, Stiff Double Boa
    Parts - BootStrapData.java line 43-86.Outsourced Part- White Lace, Black Lace, H4 Coiler Boa, Boa Cable, M2 Boa
    
F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

    1. The "Buy Now" Button added to products on mainscreen.html line 84.
    2. button decrements inventory by one with each purchase MainScreenControllerr.java line 72-99
    3. Added purchase success and purchase failed messages. mainscreen.html line 21, MainScreenControllerr.java line 85-86,96,50 

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    1. added min and max inv fields to parts. Part.java lines 32, 95-110 
    2. Modified sample inv to include max and min. BootStrapData.java lines 53-54, 62-63, 71-72, 80-81, 89-90
    3. Added text inputs for inventory for inhouse and outsourced parts forms. InHousePartForm.hmtl lines 22-23 and OutsourcedPartForm.html lines 24-25 mainscreen.html lines 50-51
    4. renamed file the persistent storage is saved to as 'spring-boot-h2-d287'. application.properties line 6
    5. added enforcement guaranteeing that inv is between or at min and max. AddOutsourcedPartController.java lines 49-25 AddInhousePartController.java lines 48-51

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

    1-3. Added error message when inventory is below minimum and above maximum. AddOutsourcedPartController.java lines 32, 54-60  AddInhousePartController.java lines 32, 54-60 InhousePartForm.html and OutsourcedPartForm.html line 11

