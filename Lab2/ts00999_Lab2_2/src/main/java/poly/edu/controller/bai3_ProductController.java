package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import poly.edu.entity.Product;

@Controller
@RequestMapping("/product3")
public class bai3_ProductController {

    @GetMapping("/form")
    public String form() {
        return "bai3_form";
    }

    @PostMapping("/save")
    public String save(Product product, Model model) {
        model.addAttribute("name", product.getName());
        model.addAttribute("price", product.getPrice());
        return "bai3_form";
    }
}
