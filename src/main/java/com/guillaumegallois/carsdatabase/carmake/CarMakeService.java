package com.guillaumegallois.carsdatabase.carmake;

import com.guillaumegallois.carsdatabase.carmake.internal.CarMake;
import org.springframework.stereotype.Service;

@Service
public class CarMakeService {

    public void createCarMake(CarMakeDTO carMakeDTO) {
        CarMake carMake = CarMake.builder()
                .objectId(carMakeDTO.getObjectId())
                .name(carMakeDTO.getName())
                .idCarMake(carMakeDTO.getIdCarMake())
                .idCarType(carMakeDTO.getIdCarType())
                .build();
    }
}
