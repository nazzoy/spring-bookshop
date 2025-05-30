package my.bookshopapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresController {

    @GetMapping("/genres")
    public String genresPage(Model model) {
        model.addAttribute("page", "genres");
        return "genres/genres";
    }
}
