package com.cinemaapp.services;

import com.cinemaapp.models.Movie;
import com.cinemaapp.models.Theater;

import java.util.ArrayList;
import java.util.List;

public class TicketService {
    private final List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public int buyTicket(Movie movie, int quantity) {
        Theater theater = movie.getTheater();
        if (!theater.hasAvailableSeats(quantity)) {
            throw new IllegalArgumentException("Not enough tickets available.");
        }
        theater.bookSeats(quantity);
        return movie.getPrice() * quantity;
    }


}
