package com.cinemaapp.services;

import com.cinemaapp.models.Movie;
import com.cinemaapp.models.Theater;

public class TicketService {
    public int buyTicket(Movie movie, int quantity) {
        Theater theater = movie.getTheater();
        if (!theater.hasAvailableSeats(quantity)) {
            throw new IllegalArgumentException("Not enough tickets available.");
        }
        theater.bookSeats(quantity);
        return movie.getPrice() * quantity;
    }


}
