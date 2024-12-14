package com.clarience.fusion.zoetisdemo.controller;

import com.clarience.fusion.zoetisdemo.model.MovieDto;
import com.clarience.fusion.zoetisdemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> createMovie(@RequestBody MovieDto movieDto) throws URISyntaxException {
//        URI uri = new URI;
        movieService.createMovie(movieDto);
        return ResponseEntity.ok(null);
    }
}
