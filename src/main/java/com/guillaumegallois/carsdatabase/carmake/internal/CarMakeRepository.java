package com.guillaumegallois.carsdatabase.carmake;

import com.guillaumegallois.carsdatabase.carmake.internal.CarMake;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMakeRepository extends MongoRepository<CarMake, String> {
}