package com.example.resptapimdb.models;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface trendingSeriesRepository extends MongoRepository<trendingSeries, String > {
}
