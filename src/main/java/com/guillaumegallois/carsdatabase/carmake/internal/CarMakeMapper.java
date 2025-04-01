package com.guillaumegallois.carsdatabase.carmake;

import com.guillaumegallois.carsdatabase.carmake.internal.CarMake;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMakeMapper {
    CarMakeMapper INSTANCE = Mappers.getMapper(CarMakeMapper.class);

    @Mapping(source = "objectId", target = "objectId", qualifiedByName = "objectIdToString")
    CarMakeDTO toCarMakeDTO(CarMake carMake);

    @Mapping(source = "objectId", target = "objectId", qualifiedByName = "stringToObjectId")
    CarMake toCarMake(CarMakeDTO carMakeDTO);

    @Named("objectIdToString")
    default String objectIdToString(ObjectId objectId) {
        return objectId != null ? objectId.toString() : null;
    }

    @Named("stringToObjectId")
    default ObjectId stringToObjectId(String objectId) {
        return objectId != null ? new ObjectId(objectId) : null;
    }

}