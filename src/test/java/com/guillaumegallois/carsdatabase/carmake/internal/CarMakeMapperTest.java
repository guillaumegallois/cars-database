package com.guillaumegallois.carsdatabase.carmake.internal;

import com.guillaumegallois.carsdatabase.carmake.CarMakeDTO;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarMakeMapperTest {

    private CarMakeMapper carMakeMapper;

    @BeforeEach
    void setUp() {
        carMakeMapper = CarMakeMapper.INSTANCE;
    }

    @Test
    void toCarMakeDTO() {
        CarMake carMake = CarMake.builder()
                .objectId(new ObjectId())
                .idCarMake(1)
                .name("Toyota")
                .dateCreate(1)
                .dateUpdate(1)
                .idCarType(1)
                .build();

        CarMakeDTO carMakeDTO = carMakeMapper.toCarMakeDTO(carMake);

        assertEquals(carMake.getObjectId(), new ObjectId(carMakeDTO.getObjectId()));
        assertEquals(carMake.getIdCarMake(), carMakeDTO.getIdCarMake());
        assertEquals(carMake.getName(), carMakeDTO.getName());
        assertEquals(carMake.getDateCreate().longValue(), carMakeDTO.getDateCreate().toEpochDay());
        assertEquals(carMake.getDateUpdate().longValue(), carMakeDTO.getDateUpdate().toEpochDay());
        assertEquals(carMake.getIdCarType(), carMakeDTO.getIdCarType());
    }

    @Test
    void toCarMake() {
        CarMakeDTO carMakeDTO = CarMakeDTO.builder()
                .objectId(new ObjectId().toString())
                .idCarMake(1)
                .name("Toyota")
                .dateCreate(LocalDate.now())
                .dateUpdate(LocalDate.now())
                .idCarType(1)
                .build();

        CarMake carMake = carMakeMapper.toCarMake(carMakeDTO);

        assertEquals(new ObjectId(carMakeDTO.getObjectId()), carMake.getObjectId());
        assertEquals(carMakeDTO.getIdCarMake(), carMake.getIdCarMake());
        assertEquals(carMakeDTO.getName(), carMake.getName());
        assertEquals(carMakeDTO.getDateCreate().toEpochDay(), carMake.getDateCreate().longValue());
        assertEquals(carMakeDTO.getDateUpdate().toEpochDay(), carMake.getDateUpdate().longValue());
        assertEquals(carMakeDTO.getIdCarType(), carMake.getIdCarType());
    }
}