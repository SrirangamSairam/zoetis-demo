package com.clarience.fusion.zoetisdemo.service;

import com.clarience.fusion.zoetisdemo.entity.Movie;
import com.clarience.fusion.zoetisdemo.model.MovieDto;
import com.clarience.fusion.zoetisdemo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public void createMovie(MovieDto movieDto) {
        Movie movie = convertDtoToEntity(movieDto);
        movieRepository.save(movie);
    }

    private static Movie convertDtoToEntity(MovieDto movieDto) {
        Movie movie = new Movie();
        movie.setDirector(movieDto.getDirector());
        movie.setTitle(movieDto.getTitle());
        movie.setReleaseYear(movieDto.getReleaseYear());
        return movie;
    }
}
