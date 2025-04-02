package com.guillaumegallois.carsdatabase.carmake;

import com.guillaumegallois.carsdatabase.carmake.internal.CarMake;
import com.guillaumegallois.carsdatabase.carmake.internal.CarMakeRepository;
import com.guillaumegallois.carsdatabase.carmake.internal.CarMakeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarMakeService {

    @Autowired
    private CarMakeRepository carMakeRepository;

    private final CarMakeMapper carMakeMapper = CarMakeMapper.INSTANCE;

    public void createCarMake(CarMakeDTO carMakeDTO) {
        CarMake carMake = carMakeMapper.toCarMake(carMakeDTO);
        carMakeRepository.save(carMake);
    }

    public List<CarMakeDTO> getAllCarMakes() {
        List<CarMake> carMakes = carMakeRepository.findAll();
        return carMakes.stream()
                .map(carMakeMapper::toCarMakeDTO)
                .collect(Collectors.toList());
    }

}
