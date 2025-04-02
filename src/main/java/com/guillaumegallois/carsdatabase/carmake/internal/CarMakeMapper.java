package com.guillaumegallois.carsdatabase.carmake.internal;

import com.guillaumegallois.carsdatabase.carmake.CarMakeDTO;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper
public interface CarMakeMapper {
    CarMakeMapper INSTANCE = Mappers.getMapper(CarMakeMapper.class);

    @Mapping(source = "objectId", target = "objectId", qualifiedByName = "objectIdToString")
    @Mapping(source = "dateCreate", target = "dateCreate", qualifiedByName = "integerToLocalDate")
    @Mapping(source = "dateUpdate", target = "dateUpdate", qualifiedByName = "integerToLocalDate")
    CarMakeDTO toCarMakeDTO(CarMake carMake);

    @Mapping(source = "objectId", target = "objectId", qualifiedByName = "stringToObjectId")
    @Mapping(source = "dateCreate", target = "dateCreate", qualifiedByName = "localDateToInteger")
    @Mapping(source = "dateUpdate", target = "dateUpdate", qualifiedByName = "localDateToInteger")
    CarMake toCarMake(CarMakeDTO carMakeDTO);

    @Named("objectIdToString")
    default String objectIdToString(ObjectId objectId) {
        return objectId != null ? objectId.toString() : null;
    }

    @Named("stringToObjectId")
    default ObjectId stringToObjectId(String objectId) {
        return objectId != null ? new ObjectId(objectId) : null;
    }

    @Named("integerToLocalDate")
    default LocalDate integerToLocalDate(Integer date) {
        return date != null ? LocalDate.ofEpochDay(date) : null;
    }

    @Named("localDateToInteger")
    default Integer localDateToInteger(LocalDate date) {
        return date != null ? (int) date.toEpochDay() : null;
    }

}