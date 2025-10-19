package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class bai5_ResultController {

    @RequestMapping("/a")
    public String m1() {
        return "bai5_a";
    }

    @RequestMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "I come from b");
        // ?1: forward đến /a để hiển thị message
        return "forward:/a";
    }

    @RequestMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from c");
        // ?2: redirect đến /a, message sẽ qua param
        return "redirect:/a";
    }

    // ?3: cho phép hiển thị trực tiếp String trả về
    @ResponseBody
    @RequestMapping("/d")
    public String m4() {
        return "I come from d";
    }
}
