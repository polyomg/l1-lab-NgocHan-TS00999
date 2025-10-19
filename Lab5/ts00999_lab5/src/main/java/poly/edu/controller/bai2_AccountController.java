package poly.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import poly.edu.service.bai1_CookieService;
import poly.edu.service.bai1_ParamService;
import poly.edu.service.bai1_SessionService;

@Controller
@RequestMapping("/account")
public class bai2_AccountController {

    @Autowired
    bai1_CookieService cookieService;

    @Autowired
    bai1_ParamService paramService;

    @Autowired
    bai1_SessionService sessionService;

    @GetMapping("/login")
    public String loginForm() {
        return "account/bai2_login";
    }

    @PostMapping("/login")
    public String loginSubmit(Model model) {
        String un = paramService.getString("username", "");
        String pw = paramService.getString("password", "");
        boolean rm = paramService.getBoolean("remember", false);

        // kiểm tra đăng nhập
        if (un.equals("poly") && pw.equals("123")) {
            sessionService.set("username", un);

            if (rm) {
                cookieService.add("user", un, 24 * 10);
            } else {
                cookieService.remove("user");
            }

            // thêm thông báo thành công
            model.addAttribute("message", "✅ Đăng nhập thành công!");
        } else {
            // thêm thông báo thất bại
            model.addAttribute("message", "❌ Đăng nhập thất bại! Sai username hoặc password.");
        }

        return "account/bai2_login";
    }
}
