package com.guillaumegallois.carsdatabase.carmodelcarmake;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CarMakeCarModelDTO {

    private String name;
    private String modele;

}
