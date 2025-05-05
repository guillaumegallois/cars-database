package com.guillaumegallois.carsdatabase.carmodelcarmake.internal;

import com.guillaumegallois.carsdatabase.carmodelcarmake.CarMakeCarModelDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CarMakeCarModelMapper {

    CarMakeCarModelMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(CarMakeCarModelMapper.class);


    CarMakeCarModelDTO carMakeCarModelMapperToCarMakeCarModelDTO(CarMakeCarModel entity);

    CarMakeCarModel carMakeCarModelDTOToCarMakeCarModel(CarMakeCarModelDTO dto);

}
