package com.guillaumegallois.carsdatabase.carmake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public void createCarMake(@RequestBody CarMakeDTO carMakeDTO) {
        carMakeService.createCarMake(carMakeDTO);
    }

}