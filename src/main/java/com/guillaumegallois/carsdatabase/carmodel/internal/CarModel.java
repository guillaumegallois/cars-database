package com.guillaumegallois.carsdatabase.carmodel.internal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CarModel {

    private ObjectId objectId;
    private Integer idCarModel;
    private Integer idCarMake;
    private String name;
    private LocalDate dateCreate;
    private LocalDate dateUpdate;
    private Integer idCarType;

}
