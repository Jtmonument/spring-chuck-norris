package chuck.norris.springchucknorris.controllers;

import chuck.norris.springchucknorris.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService service;

    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String deliverJoke(Model model) {
        model.addAttribute("jokes", service.deliverJoke());
        return "index";
    }
}
