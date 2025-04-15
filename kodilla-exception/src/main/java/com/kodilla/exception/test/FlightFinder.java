package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> mapaLotnisk = new HashMap<>();
        mapaLotnisk.put("1airport", true);
        mapaLotnisk.put("2airport", false);
        mapaLotnisk.put("3airport", false);
        mapaLotnisk.put("4airport", true);
        mapaLotnisk.put("5airport", true);
        mapaLotnisk.put("6airport", true);

        String departure = flight.getDepartureAirport();
        String arrival = flight.getArrivalAirport();

        if (mapaLotnisk.containsKey(arrival) && mapaLotnisk.containsKey(departure)) {
            System.out.println("You can go from this airport: " + mapaLotnisk.get(departure));
            System.out.println("You can go to this airport: " + mapaLotnisk.get(arrival));
        } else {
            throw new RouteNotFoundException("Airport not found.");
        }
    }
}
