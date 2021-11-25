package com.sample.demo.controller;

import com.sample.demo.dto.Movie;
import com.sample.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> allMovies =movieService.getAllMovies();
        return ResponseEntity.ok().body(allMovies);
    }
    @PostMapping("/")
    public ResponseEntity <Movie> saveMovie(@RequestBody Movie movie)
    {
        Movie movieWithId = movieService.saveMovie(movie);
        return new ResponseEntity<Movie> (movieWithId, HttpStatus.CREATED);
    }
}



