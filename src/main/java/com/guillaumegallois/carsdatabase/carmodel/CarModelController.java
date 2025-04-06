package com.guillaumegallois.carsdatabase.carmodel;

import com.guillaumegallois.carsdatabase.carmake.CarMakeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carmodels")
public class CarModelController {

    private CarModelService carModelService;


    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    @GetMapping("/all")
    public List<CarModelDTO> getAllCarMakes() {
        return carModelService.getAllCarModels();
    }

}
