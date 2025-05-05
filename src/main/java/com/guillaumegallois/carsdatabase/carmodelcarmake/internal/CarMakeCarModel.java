package com.guillaumegallois.carsdatabase.carmodelcarmake.internal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CarMakeCarModel {

    private String name;
    private String modele;

}
