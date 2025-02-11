package onlinemarketplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicOnlineMarketplaceTest {
    @Nested
    class OnlineMarketPlaceTest {
        private ProductCatalog catalog;
        private Product<BookCategory> book;
        private Product<GadgetCategory> phone;
        private Product<ClothingCategory> cloth;

        @BeforeEach
        void setUp() {
            catalog = new ProductCatalog();

            book = new Product<>("Clean Code", 50.0, BookCategory.TECHNOLOGY);
            phone = new Product<>("Redmi", 3000.0, GadgetCategory.MOBILE);
            cloth = new Product<>("Shirt", 70.0, ClothingCategory.MEN);

            catalog.addProduct(book);
            catalog.addProduct(phone);
            catalog.addProduct(cloth);
        }
            @Test
            void testCatalogContainsProducts() {
                assertEquals(3, catalog.products.size(), "Catalog should contain 3 products");
            }

            @Test
            void testApplyDiscountToBook() {
                double initialPrice = book.getPrice();
                catalog.applyDiscount(book, 10.0);
                assertEquals(initialPrice * 0.9, book.getPrice(), 0.01, "Book price should be discounted by 10%");
            }

            @Test
            void testApplyInvalidDiscount() {
                double initialPrice = cloth.getPrice();
                catalog.applyDiscount(cloth, -5.0);
                assertEquals(initialPrice, cloth.getPrice(), "Invalid negative discount should not change the price");

                catalog.applyDiscount(cloth, 150.0);
                assertEquals(initialPrice, cloth.getPrice(), "Discount above 100% should not change the price");
            }

            @Test
            void testApplyDiscountToGadget() {
                double initialPrice = phone.getPrice();
                catalog.applyDiscount(phone, 20.0);
                assertEquals(initialPrice * 0.8, phone.getPrice(), 0.01, "Phone price should be discounted by 20%");
            }

            @Test
            void testDisplayCatalogOutput() {
                // Mock output test would typically capture console output if needed
                catalog.displayCatalog();
            }

        }

    }
