package ru.synegyit.service;

import ru.synegyit.TemperatureConverterObject;
import ru.synegyit.type.TemperatureType;

public interface TemperatureConverter {

    double convert(double temp);

    static TemperatureConverter getInstance(TemperatureConverterObject converterObject) {
        TemperatureType type = converterObject.getType();
        return type.getConverter();
    }

    static double convert(TemperatureConverterObject converterObject) {
        return getInstance(converterObject).convert(converterObject.getTemperature());
    }
}




