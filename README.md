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

