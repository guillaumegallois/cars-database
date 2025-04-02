package com.guillaumegallois.carsdatabase.carmake.internal;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@Document(collection = "car_make")
public class CarMake {

    @Field("_id")
    private ObjectId objectId;
    @Field("id_car_make")
    private Integer idCarMake;
    @Field("name")
    private String name;
    @Field("date_create")
    private Integer dateCreate;
    @Field("date_update")
    private Integer dateUpdate;
    @Field("id_car_type")
    private Integer idCarType;

}
