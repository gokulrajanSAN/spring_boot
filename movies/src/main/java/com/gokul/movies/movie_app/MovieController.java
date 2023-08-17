package com.gokul.movies.movie_app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("movies")
@RequiredArgsConstructor
public class MovieController {
    MovieService movieService;

    @PostMapping
    public void save(@RequestBody Movie movie){
       movieService.save(movie);
    }
    @PutMapping
    public void update(@RequestBody Movie movie){
        movieService.update(movie);
    }

    @GetMapping
    public List<Movie> findAllMovies(){
        return movieService.findAllMovies();
    }
    @GetMapping("{id}")
    public Optional findById(@PathVariable Integer id){
        return movieService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id){
        movieService.deleteById(id);
    }
}
