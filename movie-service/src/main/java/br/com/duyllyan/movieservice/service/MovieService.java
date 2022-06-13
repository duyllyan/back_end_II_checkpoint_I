package br.com.duyllyan.movieservice.service;

import br.com.duyllyan.movieservice.entity.Movie;

public interface MovieService {
    void save(Movie movie);
    String findByGenre(String genre);
}
