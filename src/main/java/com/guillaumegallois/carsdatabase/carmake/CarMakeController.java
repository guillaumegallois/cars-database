package com.guillaumegallois.carsdatabase.carmake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carmakers")
public class CarMakeController {

    private final CarMakeService carMakeService;

    @Autowired
    public CarMakeController(CarMakeService carMakeService) {
        this.carMakeService = carMakeService;
    }

    @GetMapping("/all")
    public List<CarMakeDTO> getAllCarMakes() {
        return carMakeService.getAllCarMakes();
    }
}