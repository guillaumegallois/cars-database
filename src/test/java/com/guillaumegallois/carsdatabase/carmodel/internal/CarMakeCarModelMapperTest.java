package com.guillaumegallois.carsdatabase.carmodel.internal;

import com.guillaumegallois.carsdatabase.carmodel.CarModelDTO;
import com.guillaumegallois.carsdatabase.carmodelcarmake.CarMakeCarModelDTO;
import com.guillaumegallois.carsdatabase.carmodelcarmake.internal.CarMakeCarModel;
import com.guillaumegallois.carsdatabase.carmodelcarmake.internal.CarMakeCarModelMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarMakeCarModelMapperTest {

    private CarMakeCarModelMapper carMakeCarModelMapper;

    @BeforeEach
    void setUp() {
        carMakeCarModelMapper = CarMakeCarModelMapper.INSTANCE;
    }

    @Test
    void carMakeCarModelMapperToCarMakeCarModelDTO() {
        CarMakeCarModel carModelDTO = CarMakeCarModel.builder()
                .modele("Test Model")
                .name("Test Make")
                .build();

        CarMakeCarModelDTO carMakeCarModel = carMakeCarModelMapper.carMakeCarModelMapperToCarMakeCarModelDTO(carModelDTO);

        assertNotNull(carMakeCarModel);
        assertEquals(carModelDTO.getName(), carMakeCarModel.getName());
        assertEquals(carModelDTO.getModele(), carMakeCarModel.getModele());

    }

    @Test
    void carMakeCarModelDTOToCarMakeCarModel() {
        CarMakeCarModelDTO carMakeCarModelDTO = CarMakeCarModelDTO.builder()
                .modele("Test Model")
                .name("Test Make")
                .build();

        CarMakeCarModel carMakeCarModel = carMakeCarModelMapper.carMakeCarModelDTOToCarMakeCarModel(carMakeCarModelDTO);

        assertNotNull(carMakeCarModel);
        assertEquals(carMakeCarModelDTO.getName(), carMakeCarModel.getName());
        assertEquals(carMakeCarModelDTO.getModele(), carMakeCarModel.getModele());
    }
}