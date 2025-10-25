package Curiosity.springframework.Spring5webapp.Controllers;

import Curiosity.springframework.Spring5webapp.Repositories.AuthorRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepo authorRepo;

    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @RequestMapping("/Books/Authors")
    public String getAuthors(Model model) {

        model.addAttribute("Authors", authorRepo.findAll());

        return "/Books/Authors/list";
    }
}
