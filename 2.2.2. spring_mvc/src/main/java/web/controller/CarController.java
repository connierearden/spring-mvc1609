package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "cars") //должна быть мапа, иначе не увидит в таймлиф
    public String printCars (Model model) {
        List<Car> cars = carService.listCarByCriteria();
        cars.add(new Car("bmw", 1234));
        cars.add(new Car("qwerqwer", 213453));
        cars.add(new Car("kjnkjnv", 5436, "old"));
        model.addAttribute("cars", cars);
        return "car";
    }




}
