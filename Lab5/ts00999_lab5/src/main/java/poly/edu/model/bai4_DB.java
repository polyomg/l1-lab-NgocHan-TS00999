package poly.edu.model;

import poly.edu.entity.bai4_Item;
import java.util.HashMap;
import java.util.Map;

public class bai4_DB {
    public static Map<Integer, bai4_Item> items = new HashMap<>();
    static {
        items.put(1, new bai4_Item(1, "Samsung", 10.0, 0));
        items.put(2, new bai4_Item(2, "Nokia 2021", 20.50, 0));
        items.put(3, new bai4_Item(3, "iPhone 20", 90.49, 0));
        items.put(4, new bai4_Item(4, "Motorola", 15.55, 0));
        items.put(5, new bai4_Item(5, "Seamen", 8.99, 0));
    }
}
