package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("1airport", "2airport");
        Flight flight2 = new Flight("1airport", "4airport");
        Flight flight3 = new Flight("4airport", "7airport");

        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage() + " Try another route.");
        }

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage() + " Try another route.");
        }

        try {
            flightFinder.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage() + " Try another route.");
        }
    }
}
