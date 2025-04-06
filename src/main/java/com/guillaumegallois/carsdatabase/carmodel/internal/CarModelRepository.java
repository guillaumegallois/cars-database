package com.guillaumegallois.carsdatabase.carmodel.internal;

import com.guillaumegallois.carsdatabase.carmake.internal.CarMake;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends MongoRepository<CarModel, String> {

}
