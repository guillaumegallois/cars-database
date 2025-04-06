package com.guillaumegallois.carsdatabase.carmodel.internal;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "car_model")
public class CarModel {

    @Field("_id")
    private ObjectId objectId;
    @Field("id_car_model")
    private Integer idCarModel;
    @Field("id_car_make")
    private Integer idCarMake;
    @Field("name")
    private String name;
    @Field("id_car_type")
    private Integer idCarType;

}
