package com.guillaumegallois.carsdatabase.carmodel.internal;

import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import com.guillaumegallois.carsdatabase.carmodel.CarModelDTO;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDate;

@Mapper
public interface CarModelMapper {

    CarModelMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(CarModelMapper.class);

    @Mapping(target = "objectId", source = "objectId", qualifiedByName = "objectIdToString")
    CarModelDTO toCarModelDTO(CarModel carModel);

    @Mapping(target = "objectId", source = "objectId", qualifiedByName = "stringToObjectId")
    CarModel toCarModel(CarModelDTO carModelDTO);

    @Named("objectIdToString")
    default String objectIdToString(ObjectId objectId) {
        return objectId != null ? objectId.toString() : null;
    }

    @Named("stringToObjectId")
    default ObjectId stringToObjectId(String objectId) {
        return objectId != null ? new ObjectId(objectId) : null;
    }

}

