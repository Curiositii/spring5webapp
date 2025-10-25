package Curiosity.springframework.Spring5webapp.Controllers;

import Curiosity.springframework.Spring5webapp.Repositories.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @RequestMapping("/Books")
    public String getBooks(Model model){

        model.addAttribute("Books", bookRepo.findAll());

        return "Books/list";
    }
}
