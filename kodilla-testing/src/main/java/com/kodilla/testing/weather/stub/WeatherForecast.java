package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        for (double temperature: temperatures.getTemperatures().values()) {
            sum += temperature;
        }
        double result = sum/temperatures.getTemperatures().size();
        return result;
    }

    public double calculateMedianTemperature() {
        double result = 0;
        List<Double> temperatureList = new ArrayList<>();
        for (double temperature: temperatures.getTemperatures().values()) {
            temperatureList.add(temperature);
        }
        temperatureList.sort(null);
        if (temperatureList.size() % 2 != 0) {
            result = temperatureList.get((temperatureList.size() - 1)/2);
        } else {
            result = (temperatureList.get((temperatureList.size()- 1)/2) + temperatureList.get((temperatureList.size()- 1)/2+ 1))/2;
        }
        return result;
    }
}
