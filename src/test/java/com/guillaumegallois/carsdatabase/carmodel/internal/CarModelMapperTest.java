package com.guillaumegallois.carsdatabase.carmodel.internal;

import com.guillaumegallois.carsdatabase.carmodel.CarModelDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarModelMapperTest {

    private CarModelMapper carModelMapper;

    @BeforeEach
    void setUp() {
        carModelMapper = CarModelMapper.INSTANCE;
    }

    @Test
    void toCarModelDTO() {
        // Given
        CarModel carModel = new CarModel();
        carModel.setIdCarMake(1);
        carModel.setIdCarType(2);
        carModel.setIdCarModel(3);
        carModel.setName("Test Model");

        // When
        CarModelDTO carModelDTO = carModelMapper.toCarModelDTO(carModel);

        // Then
        assertEquals(carModel.getIdCarMake(), carModelDTO.getIdCarMake());
        assertEquals(carModel.getIdCarType(), carModelDTO.getIdCarType());
        assertEquals(carModel.getIdCarModel(), carModelDTO.getIdCarModel());
        assertEquals(carModel.getName(), carModelDTO.getName());
    }

    @Test
    void toCarModel() {
        // Given
        CarModelDTO carModelDTO = CarModelDTO.builder()
                .objectId("1234567890abcdef12345678")
                .name("Test Model")
                .idCarMake(1)
                .idCarType(2)
                .idCarModel(3)
                .build();

        // When
        CarModel carModel = carModelMapper.toCarModel(carModelDTO);

        // Then
        assertEquals(carModelDTO.getIdCarMake(), carModel.getIdCarMake());
        assertEquals(carModelDTO.getIdCarType(), carModel.getIdCarType());
        assertEquals(carModelDTO.getIdCarModel(), carModel.getIdCarModel());
        assertEquals(carModelDTO.getName(), carModel.getName());
    }
}