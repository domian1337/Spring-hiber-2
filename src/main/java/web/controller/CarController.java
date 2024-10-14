package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.*;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("view", "Table car");
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
