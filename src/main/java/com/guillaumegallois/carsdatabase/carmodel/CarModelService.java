package com.guillaumegallois.carsdatabase.carmodel;

import com.guillaumegallois.carsdatabase.carmake.CarMakeDTO;
import com.guillaumegallois.carsdatabase.carmake.internal.CarMakeMapper;
import com.guillaumegallois.carsdatabase.carmodel.internal.CarModel;
import com.guillaumegallois.carsdatabase.carmodel.internal.CarModelMapper;
import com.guillaumegallois.carsdatabase.carmodel.internal.CarModelRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelService {

    @Autowired
    private CarModelRepository carModelRepository;

    private final CarModelMapper carMakeMapper = CarModelMapper.INSTANCE;

    public void createCarModel(CarModelDTO carModelDTO) {
        CarModel carModel = CarModel.builder()
                .objectId(new ObjectId(carModelDTO.getObjectId()))
                .name(carModelDTO.getName())
                .idCarMake(carModelDTO.getIdCarMake())
                .idCarType(carModelDTO.getIdCarType())
                .idCarModel(carModelDTO.getIdCarModel())
                .build();
    }

    public List<CarModelDTO> getAllCarModels() {
        return carModelRepository.findAll().stream()
                .map(carMakeMapper::toCarModelDTO)
                .toList();
    }
}
