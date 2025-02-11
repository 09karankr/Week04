package onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    public final List<Product<?>> products = new ArrayList<>();

    // add product to catalog
    public void addProduct(Product<?> product){
        products.add(product);
    }
    // displaying the product catalog
    public void displayCatalog(){
        for(Product<?> product: products){
            System.out.println(product);
        }
    }

    // applying discount
    public <T> void applyDiscount(Product<T> product, double percentage){
        if (percentage > 0 && percentage <=100){
            double discount  = product.getPrice() * (percentage/100);
            product.setPrice(product.getPrice() - discount);
            System.out.println("Discount applied to " + product.getName() + " : New Price = " + product.getPrice());
        } else {
            System.out.println("invalid discount percentage");
        }
    }

}
