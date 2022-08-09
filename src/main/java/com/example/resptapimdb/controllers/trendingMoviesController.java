package com.example.resptapimdb.controllers;

import com.example.resptapimdb.CustomizedResponse;
import com.example.resptapimdb.models.trendingMovies;
import com.example.resptapimdb.services.trendingMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
@CrossOrigin(origins = "https://git.heroku.com/digital-vid-str.git")
@RestController
public class trendingMoviesController
{
    @Autowired
    private trendingMoviesService service;

    @GetMapping("/trendingMovies")
    public ResponseEntity getTrendingMovies()
    {
        var customizedResponse= new CustomizedResponse("A list of trending movies", service.getTrendingMovies());
        return new ResponseEntity(customizedResponse, HttpStatus.OK);
    }

    @GetMapping("/trendingMovies/{id}")
    public ResponseEntity getATrendingMovie(@PathVariable("id")String id) {
        CustomizedResponse customizedResponse= null;
        try {
            customizedResponse = new CustomizedResponse("Trending Movie wih id "+ id , Collections.singletonList(service.getATrendingMovie(id)));
        } catch (Exception e) {

            customizedResponse=new CustomizedResponse(e.getMessage(), null);

            return new ResponseEntity(customizedResponse,HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(customizedResponse,HttpStatus.OK);
    }


    @PostMapping(value = "/trendingMovies", consumes = {
            MediaType.APPLICATION_JSON_VALUE
    })

    public ResponseEntity addMovie(@RequestBody trendingMovies trendingMovie)
    {
        service.insertIntoTrendingMovie(trendingMovie);
        return new ResponseEntity(trendingMovie, HttpStatus.OK);

    }
}
