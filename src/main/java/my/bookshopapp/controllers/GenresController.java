package my.bookshopapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresController {

    @GetMapping("/genres")
    public String showGenres() {
        // Возвращаем имя шаблона, который лежит по пути resources/templates/genres/index.html
        return "genres/genres";
    }
}
