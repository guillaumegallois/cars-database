package com.guillaumegallois.carsdatabase.carmake;

import com.guillaumegallois.carsdatabase.carmake.internal.CarMake;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

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

    public List<CarMakeDTO> getAllCarMakes() {
        CarMakeDTO carMake1 = CarMakeDTO.builder()
                .objectId("1")
                .idCarMake(1)
                .name("Toyota")
                .idCarType(1)
                .build();
        CarMakeDTO carMake2 = CarMakeDTO.builder()
                .objectId("2")
                .idCarMake(2)
                .name("Ford")
                .idCarType(2)
                .build();
        CarMakeDTO carMake3 = CarMakeDTO.builder()
                .objectId("3")
                .idCarMake(3)
                .name("Honda")
                .idCarType(3)
                .build();
        return Arrays.asList(carMake1, carMake2, carMake3);
    }
}
