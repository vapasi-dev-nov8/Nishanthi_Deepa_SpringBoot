package com.sample.demo.repository;

import com.sample.demo.dto.Movie;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MovieRepository {
    List<Movie> allMovie = new ArrayList<>();

    public List<Movie> getAllMovies() {
        allMovie.add(new Movie(101,"Knives Out","Ryan Johnson","Chris Evans"));
        allMovie.add(new Movie(102,"Brick","Ryan Johnson","Lukas Hass"));
        allMovie.add(new Movie(103,"Munich","Steven SpielBerg","Daniel Craig"));
        return allMovie;
    }

    public Movie saveMovie(Movie movie) {
        allMovie.add(new Movie(104, movie.getName(), movie.getDirectorName(), movie.getActor()));
        return  allMovie.get(allMovie.size()-1);
    }
}

