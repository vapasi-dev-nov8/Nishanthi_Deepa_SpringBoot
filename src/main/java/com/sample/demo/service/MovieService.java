package com.sample.demo.service;

import com.sample.demo.dto.Movie;
import com.sample.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    MovieRepository movieRepository;
    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();

    }


    public Movie saveMovie(Movie movie) {
        return movieRepository.saveMovie(movie);
    }
}
