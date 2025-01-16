package com.example.trainservice.dto;

public class TrainRequest {
    private String trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private String schedule;
    private int availableSeats;

    // Getters
    public String getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // Setters
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
