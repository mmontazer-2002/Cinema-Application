package com.cinemaapp.models;

public class Theater {
    private int theaterId;
    private int totalSeats;
    private int bookedSeats = 0;

    public Theater(int theaterId, int totalSeats) {
        this.theaterId = theaterId;
        this.totalSeats = totalSeats;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public boolean AvailableSeats(){
        return true;
    }


    @Override
    public String toString() {
        return "Theater{" +
                "theaterId=" + theaterId +
                ", totalSeats=" + totalSeats +
                ", bookedSeats=" + bookedSeats +
                '}';
    }
}
