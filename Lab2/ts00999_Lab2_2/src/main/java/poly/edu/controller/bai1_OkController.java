package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ctrl")
public class bai1_OkController {

    @GetMapping("/ok")
    public String m2(Model model, @RequestParam(required = false) String x) {
        if (x != null) {
            model.addAttribute("method", "m3()");
        } else {
            model.addAttribute("method", "m2()");
        }
        return "bai1_ok";
    }

    @PostMapping("/ok")
    public String m1(Model model) {
        model.addAttribute("method", "m1()");
        return "bai1_ok";
    }
}
