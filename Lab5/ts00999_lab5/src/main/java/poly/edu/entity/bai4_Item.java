package poly.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class bai4_Item {
    Integer id;
    String name;
    double price;
    int qty = 1;
}
