package com.cinemaapp.services;

import com.cinemaapp.models.Movie;
import com.cinemaapp.models.Theater;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketServiceTest {

    private TicketService ticketService;
    private Movie movie;
    private Theater theater;

    @BeforeEach
    void setup() {
        theater = new Theater(1, 100);
        movie = new Movie(1, "Inception", 50, theater);
        ticketService = new TicketService();
    }

    @Test
    void buyTickets_shouldReduceAvailableSeats_andReturnCorrectTotalPrice() {
        assertEquals(150, ticketService.buyTicket(movie, 3));
        assertEquals(3, theater.getBookedSeats());
    }

    @Test
    public void buyTickets_shouldThrowException_whenNotEnoughSeatsAvailable() {
        theater.bookSeats(98);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ticketService.buyTicket(movie, 3);
        });

        assertEquals("Not enough tickets available.", exception.getMessage());
    }
}
