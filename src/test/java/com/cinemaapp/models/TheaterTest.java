package com.cinemaapp.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TheaterTest {

    @Test
    void hasAvailableSeats_whenSeatsAvailable_returnsTrue() {
        Theater theater = new Theater(1, 50);
        assertTrue(theater.hasAvailableSeats(50));
    }

    @Test
    void hasAvailableSeats_whenSeatsNotAvailable_returnsFalse() {
        Theater theater = new Theater(1, 10);
        theater.bookSeats(8);
        assertFalse(theater.hasAvailableSeats(50));
    }

    @Test
    void bookSeats_whenNotEnoughSeats_throwsException() {
        Theater theater = new Theater(1, 10);
        theater.bookSeats(8);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            theater.bookSeats(5);
        });
        assertEquals("not enough seats!!!", exception.getMessage());

    }
}
