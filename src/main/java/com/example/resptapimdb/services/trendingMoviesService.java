package com.example.resptapimdb.services;

import com.example.resptapimdb.models.trendingMovies;
import com.example.resptapimdb.models.trendingMoviesRepository;
import com.example.resptapimdb.models.trendingMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class trendingMoviesService
{
    @Autowired
    private trendingMoviesRepository repository;
    @Autowired
    private MongoTemplate mongoTemplate;


    public List<trendingMovies> getTrendingMovies()
    {
        //validation or calculation or call model
        return repository.findAll();
    }

    public void insertIntoTrendingMovie(trendingMovies trendingMovie)
    {
        repository.insert(trendingMovie);
    }

    public Optional<trendingMovies> getATrendingMovie(String id) throws Exception
    {
        Optional<trendingMovies> trendingMovie=repository.findById(id);
        if(!trendingMovie.isPresent())
        {
            throw new Exception("Movie with " + id + "is not found");
        }
        return trendingMovie;
    }



}
