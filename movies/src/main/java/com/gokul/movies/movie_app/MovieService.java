package com.gokul.movies.movie_app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    MovieRepo movieRepo;

    public void save(Movie movie) {
        movieRepo.save(movie);
    }
    public void update(Movie movie) {
        movieRepo.save(movie);
    }

    public List<Movie> findAllMovies() {
       return movieRepo.findAll();
    }
    public Optional<Movie> findById(Integer id) {
        return movieRepo.findById(id);
    }

    public void deleteById(Integer id) {
        movieRepo.deleteById(id);
    }
}

