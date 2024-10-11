package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping ("/cars")
    public String cars(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm a Car");
        messages.add("ford mustang ");
        model.addAttribute("messages", messages);
        return "cars";
    }
}
