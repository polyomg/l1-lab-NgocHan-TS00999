package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import poly.edu.model.bai4_DB;

@Controller
public class bai5_ItemController {
    @RequestMapping("/item/index")
    public String list(Model model) {
        model.addAttribute("items", bai4_DB.items.values());
        return "item/bai5_item";
    }
}
