package com.cinemaapp.models;

public class Movie {
    private int movieId;
    private String title;
    private int price;
    private Theater theater;

    public Movie(int movieId, String title, int price, Theater theater) {
        this.movieId = movieId;
        this.title = title;
        this.price = price;
        this.theater = theater;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", theater=" + theater +
                '}';
    }
}
