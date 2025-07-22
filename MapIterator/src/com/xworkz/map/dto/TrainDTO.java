package com.xworkz.map.dto;

public class TrainDTO {

    private String trainName;
    private int trainNumber;
    private String sourceStation;
    private String destinationStation;
    private int numberOfCoaches;
    private String trainType;
    private double ticketPrice;
    private boolean isElectric;
    private double averageSpeed;
    private String operatingZone;

    public TrainDTO() {
    }

    public TrainDTO(String trainName, int trainNumber, String sourceStation, String destinationStation, int numberOfCoaches, String trainType, double ticketPrice, boolean isElectric, double averageSpeed, String operatingZone) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.numberOfCoaches = numberOfCoaches;
        this.trainType = trainType;
        this.ticketPrice = ticketPrice;
        this.isElectric = isElectric;
        this.averageSpeed = averageSpeed;
        this.operatingZone = operatingZone;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public int getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(int numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getOperatingZone() {
        return operatingZone;
    }

    public void setOperatingZone(String operatingZone) {
        this.operatingZone = operatingZone;
    }

    @Override
    public String toString() {
        return "TrainDTO{" +
                "trainName='" + trainName + '\'' +
                ", trainNumber=" + trainNumber +
                ", sourceStation='" + sourceStation + '\'' +
                ", destinationStation='" + destinationStation + '\'' +
                ", numberOfCoaches=" + numberOfCoaches +
                ", trainType='" + trainType + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", isElectric=" + isElectric +
                ", averageSpeed=" + averageSpeed +
                ", operatingZone='" + operatingZone + '\'' +
                '}';
    }
}
