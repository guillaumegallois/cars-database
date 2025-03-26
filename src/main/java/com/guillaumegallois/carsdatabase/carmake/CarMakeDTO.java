package com.guillaumegallois.carsdatabase.carmake;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CarMakeDTO {

    private String objectId;
    private Integer idCarMake;
    private String name;
    private LocalDate dateCreate;
    private LocalDate dateUpdate;
    private Integer idCarType;

}
