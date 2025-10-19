package poly.edu.service;

import poly.edu.entity.bai4_Item;
import java.util.Collection;

public interface bai4_ShoppingCartService {
    bai4_Item add(Integer id);
    void remove(Integer id);
    bai4_Item update(Integer id, int qty);
    void clear();
    Collection<bai4_Item> getItems();
    int getCount();
    double getAmount();
}
