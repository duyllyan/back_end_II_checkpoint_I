package br.com.duyllyan.catalogservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movie;
    @Override
    public String getMovie(String genre) {
        return movie.findMovie(genre);
    }
}
