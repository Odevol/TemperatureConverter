import java.util.Scanner;

public class TemperatureConverterRunner {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        TemperatureConverterObject a = new TemperatureConverterObject();
        a.setCountry("USA");
        a.setTemperature(0);
        System.out.println(a.getCountry());
        System.out.println(a.getType());
        TemperatureConverter.getNewTemp(a.getType());
        TemperatureConverterObject b = new TemperatureConverterObject();
        b.setCountry("Science");
        b.setTemperature(0);
        System.out.println(b.getCountry());
        System.out.println(b.getType());
        TemperatureConverter.getNewTemp(b.getType());
        TemperatureConverterObject c = new TemperatureConverterObject();
        c.setCountry("Russia");
        c.setTemperature(0);
        System.out.println(c.getCountry());
        System.out.println(c.getType());
        TemperatureConverter.getNewTemp(c.getType());
        }
    }

