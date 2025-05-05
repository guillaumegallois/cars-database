package com.guillaumegallois.carsdatabase.carmodelcarmake.internal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

@Repository
public class CarMakeCarModelRepositoryImpl implements CarMakeCarModelRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<CarMakeCarModel> getAllModels() {
        Aggregation aggregation = newAggregation(
                lookup("car_model", "id_car_make", "id_car_make", "modeles"),
                unwind("modeles"),
                project("1", "name").and("modeles.name").as("car_modele_name")
        );
        AggregationResults<CarMakeCarModel> results = mongoTemplate.aggregate(aggregation, "car_make", CarMakeCarModel.class);
        return results.getMappedResults();
    }

}