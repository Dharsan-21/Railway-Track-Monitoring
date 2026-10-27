
package com.railway;

public class Sensor {

    private final String sectionId;
    private final double vibration;
    private final double temperature;
    private final double displacement;

    public Sensor(String sectionId, double vibration,
                  double temperature, double displacement) {
        this.sectionId = sectionId;
        this.vibration = vibration;
        this.temperature = temperature;
        this.displacement = displacement;
    }

    public String getSectionId() {
        return sectionId;
    }

    public double getVibration() {
        return vibration;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getDisplacement() {
        return displacement;
    }
}
