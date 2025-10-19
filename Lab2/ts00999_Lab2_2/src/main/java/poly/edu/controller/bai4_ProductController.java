package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import poly.edu.entity.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bai4_product")
public class bai4_ProductController {

    // Danh sách sản phẩm (khởi tạo với 3 sản phẩm sẵn có)
    private List<Product> items = new ArrayList<>();

    public bai4_ProductController() {
        items.add(new Product("Samsung", 500.0));
        items.add(new Product("Oppo", 300.0));
        items.add(new Product("Nokia", 200.0));
    }

    @GetMapping("/form")
    public String form(Model model) {
        // Khởi tạo rỗng để tránh lỗi khi mở form lần đầu
        model.addAttribute("p1", new Product());
        model.addAttribute("p2", new Product());
        model.addAttribute("items", items);
        return "bai4_form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product p, Model model) {
        // p1 và p2 đều nhận giá trị nhập vào
        model.addAttribute("p1", p);
        model.addAttribute("p2", p);

        // thêm sản phẩm mới vào danh sách
        items.add(p);
        model.addAttribute("items", items);

        return "bai4_form";
    }
}
