public interface TemperatureConverter {

    double convert();

    static TemperatureConverter getFahrenheitInstance() {
        return new FahrenheitConverter();
    }

    static TemperatureConverter getKelvinInstance() {
        return new KelvinConverter();
    }

    static TemperatureConverter getCelsiusInstance(){
        return new CelsiusConverter();
    }

    static void getNewTemp(String type) {
        switch (type) {
            case "Fahrenheit": {
                TemperatureConverter temperatureConverter = getFahrenheitInstance();
                System.out.println(temperatureConverter.convert());
                break;
            }
            case "Kelvin": {
                TemperatureConverter temperatureConverter = getKelvinInstance();
                System.out.println(temperatureConverter.convert());
                break;
            }
            case "Celsius": {
                TemperatureConverter temperatureConverter = getCelsiusInstance();
                System.out.println(temperatureConverter.convert());
                break;
            }
            default:
                break;
        }
    }
}




