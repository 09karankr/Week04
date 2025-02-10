package smartwarehousesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartWarehouseSystemTest {
    @Test
    void testAddSingleElectronicsItem(){
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics phone = new Electronics("Smartphone" , 700);

        electronicsStorage.addItem(phone);

        assertEquals(1, electronicsStorage.getItems().size(), "There should be one item in storage");
        assertEquals(phone, electronicsStorage.getItems().get(0), "The item in storage should be the same as the one added");

    }
    @Test
    void testAddSingleGroceryItem(){
        Storage<Groceries> groceriesStorage = new Storage<>();
        Groceries grocers = new Groceries("Milk", 200);

        groceriesStorage.addItem(grocers);
        assertEquals(1, groceriesStorage.getItems().size());
        assertEquals(grocers, groceriesStorage.getItems().get(0));
    }
    @Test
    void testEmptyFurnitureStorage() {
        Storage<Furniture> furnitureStorage = new Storage<>();

        assertTrue(furnitureStorage.getItems().isEmpty(), "Furniture storage should be empty initially");
    }

    @Test
    void testMultipleFurnitureItems() {
        Storage<Furniture> furnitureStorage = new Storage<>();
        Furniture chair = new Furniture("Chair", 59.99);
        Furniture table = new Furniture("Table", 199.99);

        furnitureStorage.addItem(chair);
        furnitureStorage.addItem(table);

        assertEquals(2, furnitureStorage.getItems().size(), "There should be two items in storage");
    }

}
