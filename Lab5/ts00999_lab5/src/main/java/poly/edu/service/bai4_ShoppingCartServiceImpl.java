package poly.edu.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import poly.edu.entity.bai4_Item;
import poly.edu.model.bai4_DB;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SessionScope
@Service
public class bai4_ShoppingCartServiceImpl implements bai4_ShoppingCartService {
    Map<Integer, bai4_Item> map = new HashMap<>();

    @Override
    public bai4_Item add(Integer id) {
        bai4_Item item = map.get(id);
        if (item == null) {
            item = bai4_DB.items.get(id);
            if (item != null) {
                item.setQty(1);
                map.put(id, item);
            }
        } else {
            item.setQty(item.getQty() + 1);
        }
        return item;
    }

    @Override
    public void remove(Integer id) {
        map.remove(id);
    }

    @Override
    public bai4_Item update(Integer id, int qty) {
        bai4_Item item = map.get(id);
        if (item != null) item.setQty(qty);
        return item;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Collection<bai4_Item> getItems() {
        return map.values();
    }

    @Override
    public int getCount() {
        return map.values().stream().mapToInt(bai4_Item::getQty).sum();
    }

    @Override
    public double getAmount() {
        return map.values().stream()
                .mapToDouble(i -> i.getPrice() * i.getQty())
                .sum();
    }
}
