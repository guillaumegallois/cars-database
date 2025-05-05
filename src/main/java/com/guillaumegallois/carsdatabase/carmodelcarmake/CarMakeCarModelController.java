package com.guillaumegallois.carsdatabase.carmodelcarmake;

import com.guillaumegallois.carsdatabase.carmodelcarmake.internal.CarMakeCarModelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carmakecarsmodels")
public class CarMakeCarModelController {

    private final CarMakeCarModelService carMakeCarModelService;

    public CarMakeCarModelController(CarMakeCarModelService carMakeCarModelService) {
        this.carMakeCarModelService = carMakeCarModelService;
    }

    public List<CarMakeCarModelDTO> getAllCarMakeCarModels() {
        return carMakeCarModelService.getAllCarMakeCarModels();
    }
}
