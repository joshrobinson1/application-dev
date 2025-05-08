package com.example.demo.booking;

import com.example.demo.restaurant.Restaurant;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private Long id;
    private Restaurant restaurant;
    private LocalDate date;
    private LocalTime time;
    private int numberOfGuests;

    // Constructors, getters, and setters

    public Booking() {
    }

    public Booking(Long id, Restaurant restaurant, LocalDate date, LocalTime time, int numberOfGuests) {
        this.id = id;
        this.restaurant = restaurant;
        this.date = date;
        this.time = time;
        this.numberOfGuests = numberOfGuests;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}