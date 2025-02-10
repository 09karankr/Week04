package smartwarehousesystem;

public class SmartWarehouseSystem {

    public static void main(String[] args) {
        Storage<Electronics> electricStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // add items to each storage
        electricStorage.addItem(new Electronics("Smartphone",700));
        electricStorage.addItem(new Electronics("Laptop",1200));

        groceriesStorage.addItem(new Groceries("Apple", 0.99));
        groceriesStorage.addItem(new Groceries("Milk", 2.33));

        furnitureStorage.addItem(new Furniture("Chair", 533.0));
        furnitureStorage.addItem(new Furniture("Table", 200));


        // display items
        Storage.displayItems(electricStorage);
        Storage.displayItems(groceriesStorage.getItems());
        Storage.displayItems(furnitureStorage.getItems());

    }
}
