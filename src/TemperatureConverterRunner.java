public class TemperatureConverterRunner {
    public static void main(String[] args) {
        TemperatureConverterObject a = new TemperatureConverterObject();
        a.setCountry("USA");
        a.setTemperature(100);
        System.out.println(a.getCountry());
        System.out.println(a.getType());
        TemperatureConverter.getNewTemp(a.getType(), a.getTemperature());
        System.out.println("");
        TemperatureConverterObject b = new TemperatureConverterObject();
        b.setCountry("Science");
        b.setTemperature(100);
        System.out.println(b.getCountry());
        System.out.println(b.getType());
        TemperatureConverter.getNewTemp(b.getType(), b.getTemperature());
        System.out.println("");
        TemperatureConverterObject c = new TemperatureConverterObject();
        c.setCountry("Russia");
        c.setTemperature(100);
        System.out.println(c.getCountry());
        System.out.println(c.getType());
        TemperatureConverter.getNewTemp(c.getType(), c.getTemperature());
        }
    }

