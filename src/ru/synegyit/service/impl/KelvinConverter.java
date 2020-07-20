package ru.synegyit.service.impl;

import ru.synegyit.service.TemperatureConverter;

public class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double temp) {
        double temperature = temp + 273.15;
        return temperature;
    }
}
