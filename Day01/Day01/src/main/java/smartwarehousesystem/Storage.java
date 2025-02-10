package smartwarehousesystem;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
     private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    //Add item
    public void addItem(T item){
        items.add(item);
        System.out.println("Items added to the list: " + item);

    }

    //Get items
    public List<T> getItems(){
        return  items;

    }
    // display
    public static void displayItems(List<? extends WarehouseItem> items){
        System.out.println("Displaying all the items:" );
        for (WarehouseItem item: items){
            System.out.println(item);
        }

    }
}
