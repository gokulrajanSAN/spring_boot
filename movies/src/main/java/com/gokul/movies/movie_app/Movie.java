package com.gokul.movies.movie_app;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Movie_List_Table")
@Builder
public class Movie {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
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
