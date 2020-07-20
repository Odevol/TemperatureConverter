package ru.synegyit;

import ru.synegyit.service.TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverterObject converterObject = new TemperatureConverterObject();
        System.out.println("Type country");
        converterObject.setCountry(scanner.nextLine());
        System.out.println("Type value");
        converterObject.setTemperature(scanner.nextDouble());
        double convertedValue = TemperatureConverter.convert(converterObject);
        System.out.println(convertedValue);
    }
}

