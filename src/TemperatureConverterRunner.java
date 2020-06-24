import java.util.Scanner;

public class TemperatureConverterRunner {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        TemperatureConverterObject a = new TemperatureConverterObject();
        Scanner country = new Scanner(System.in);
        a.setCountry(country);
        Scanner temp = new Scanner(System.in);
        a.setTemperature(temp);
        a.setType();
        System.out.println(a.getType());
        switch (a.getType()){
            case "Fahrenheit": {
                TemperatureConverter temperatureConverter = new FahrenheitConverter(a.getTemperature());
                System.out.println(temperatureConverter.convert());
                break;
            }
            case "Kelvin" :{
                TemperatureConverter temperatureConverter = new KelvinConverter(a.getTemperature());
                System.out.println(temperatureConverter.convert());
                break;
            }
            case "Celsius" :{
                TemperatureConverter temperatureConverter = new CelsiusConverter(a.getTemperature());
                System.out.println(temperatureConverter.convert());
                break;
            }
            default:
                break;
            }
        }
    }

