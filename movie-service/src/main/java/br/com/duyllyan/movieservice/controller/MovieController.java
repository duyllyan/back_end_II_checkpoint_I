package br.com.duyllyan.movieservice.controller;

import br.com.duyllyan.movieservice.entity.Movie;
import br.com.duyllyan.movieservice.service.MovieService;
import br.com.duyllyan.movieservice.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Movie movie){
        service.save(movie);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genre}")
    public String find(@PathVariable String genre) {
        return service.findByGenre(genre);
    }
}
