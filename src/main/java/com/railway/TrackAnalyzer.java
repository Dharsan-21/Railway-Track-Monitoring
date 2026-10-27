
package com.railway;

public class TrackAnalyzer {

    public String analyze(Sensor sensor) {

        if (sensor == null) {
            throw new IllegalArgumentException("Sensor cannot be null");
        }

        if (sensor.getVibration() < 0 ||
            sensor.getTemperature() < 0 ||
            sensor.getDisplacement() < 0) {
            throw new IllegalArgumentException("Sensor readings cannot be negative");
        }

        if (sensor.getVibration() > 20 ||
            sensor.getTemperature() > 45 ||
            sensor.getDisplacement() > 10) {
            return "CRITICAL";
        }

        if (sensor.getVibration() > 10 ||
            sensor.getTemperature() > 38 ||
            sensor.getDisplacement() > 5) {
            return "WARNING";
        }

        return "HEALTHY";
    }
}

