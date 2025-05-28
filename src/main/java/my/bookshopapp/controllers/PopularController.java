package my.bookshopapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopularController {

    @GetMapping("/popular")
    public String popularPage(Model model) {
        model.addAttribute("page", "popular");
        return "books/popular";
    }
}
