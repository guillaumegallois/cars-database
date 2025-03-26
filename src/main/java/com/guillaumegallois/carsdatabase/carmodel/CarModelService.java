package com.guillaumegallois.carsdatabase.carmodel;

import com.guillaumegallois.carsdatabase.carmodel.internal.CarModel;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class CarModelService {

    public void createCarModel(CarModelDTO carModelDTO) {
        CarModel carModel = CarModel.builder()
                .objectId(new ObjectId(carModelDTO.getObjectId()))
                .name(carModelDTO.getName())
                .idCarMake(carModelDTO.getIdCarMake())
                .idCarType(carModelDTO.getIdCarType())
                .idCarModel(carModelDTO.getIdCarModel())
                .build();
    }

}
