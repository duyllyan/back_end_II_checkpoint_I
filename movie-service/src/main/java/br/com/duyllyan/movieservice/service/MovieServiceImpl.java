package br.com.duyllyan.movieservice.service;

import br.com.duyllyan.movieservice.entity.Movie;
import br.com.duyllyan.movieservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository repository;

    @Override
    public void save(Movie movie) {
        repository.save(movie);
    }

    @Override
    public String findByGenre(String genre) {
        return repository.findByGenre(genre).getName();
    }
}
