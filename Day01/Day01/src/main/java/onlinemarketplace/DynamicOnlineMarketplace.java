package onlinemarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // creating diff products
        Product<BookCategory> book = new Product<>("Java Programming",500, BookCategory.TECHNOLOGY);
        Product<GadgetCategory> gadget = new Product<>("Mobile", 600.0, GadgetCategory.MOBILE);
        Product<ClothingCategory> cloth = new Product<>("Shirt" , 200 , ClothingCategory.MEN);

        catalog.addProduct(book);
        catalog.addProduct(gadget);
        catalog.addProduct(cloth);

        System.out.println("Display catalog");
        catalog.displayCatalog();

        catalog.applyDiscount(book,10.0);
        catalog.applyDiscount(gadget, 20.0);

        System.out.println("Product catalog after discount: ");
        catalog.displayCatalog();

    }
}
