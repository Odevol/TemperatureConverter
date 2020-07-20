package ru.synegyit.service.impl;

import ru.synegyit.service.TemperatureConverter;

public class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convert(double temp) {
        return temp;
    }
}
