package com.gokul.movies.movie_app;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
@Entity
@Table(name = "Movie List Table")
public class Movie {
    @Id
    @GeneratedValue(strategy =GenerationType.TABLE)
    @Column(name = "ID")
    Integer id;

    @Column(unique = true,name = "Movie_name")
    String movieName;

    @Column(name = "Actor")
    String actor;

    @Column(name = "Year")
    Integer year;

    @Column(name = "IMDB Rating")
    Integer imdb;

    @Column(name = "Genre")
    String genre;
}
