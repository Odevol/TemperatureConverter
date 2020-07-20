package ru.synegyit;

import ru.synegyit.type.TemperatureType;

public class TemperatureConverterObject {

    private String country;
    private double temperature;

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public TemperatureType getType() {
        for (TemperatureType type : TemperatureType.values()) {
            if (type.belongToCountry(this.country)) {
                return type;
            }
        }
        return TemperatureType.UNKNOWN;
    }
}