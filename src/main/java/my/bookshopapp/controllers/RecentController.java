package my.bookshopapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecentController {

    @GetMapping("/recent")
    public String recentPage(Model model) {
        model.addAttribute("page", "recent");
        return "books/recent";
    }
}
