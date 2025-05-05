package com.guillaumegallois.carsdatabase.carmodelcarmake.internal;

import com.guillaumegallois.carsdatabase.carmodelcarmake.CarMakeCarModelDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMakeCarModelService {

    private final CarMakeCarModelRepositoryCustom carMakeCarModelRepositoryCustom;

    private final CarMakeCarModelMapper carMakeCarModelMapper = CarMakeCarModelMapper.INSTANCE;

    public CarMakeCarModelService(CarMakeCarModelRepositoryCustom carMakeCarModelRepository) {
        this.carMakeCarModelRepositoryCustom = carMakeCarModelRepository;
    }

    public List<CarMakeCarModelDTO> getAllCarMakeCarModels() {
        return carMakeCarModelRepositoryCustom.getAllModels().stream().map(carMakeCarModelMapper::carMakeCarModelMapperToCarMakeCarModelDTO).toList();
    }

}
