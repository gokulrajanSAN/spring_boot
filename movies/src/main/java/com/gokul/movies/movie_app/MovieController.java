package com.gokul.movies.movie_app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("movieList")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping
    public void save(@RequestBody Movie movie){
       movieService.save(movie);
    }
    @PutMapping
    public void update(@RequestBody Movie movie){
        movieService.update(movie);
    }

    @GetMapping("allMovies")
    public List<Movie> findAllMovies(){
        return movieService.findAllMovies();
    }

    @GetMapping("{id}")
    public Movie findById(@PathVariable Integer id){
        Optional<Movie> byId = movieService.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }else {
            return null;
        }
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id){
        movieService.deleteById(id);
    }
}
