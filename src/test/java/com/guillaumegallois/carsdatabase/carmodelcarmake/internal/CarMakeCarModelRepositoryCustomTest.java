package com.guillaumegallois.carsdatabase.carmodelcarmake.internal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarMakeCarModelRepositoryCustomTest {

    @Autowired
    private CarMakeCarModelRepositoryCustom carMakeCarModelRepositoryCustom;

    @Test
    void getAllModels() {
        // Given

        // When
        List<CarMakeCarModel> carMakeCarModels = carMakeCarModelRepositoryCustom.getAllModels();

        // Then
        assertNotNull(carMakeCarModels);
        assertFalse(carMakeCarModels.isEmpty());
        assertFalse(carMakeCarModels.stream().filter(carMakeCarModel -> carMakeCarModel.getName().equals("Honda")).toList().isEmpty());
    }
}