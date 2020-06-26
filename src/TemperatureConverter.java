public interface TemperatureConverter {

    double convert(double temp);

    static TemperatureConverter getFahrenheitInstance() {
        return new FahrenheitConverter();
    }

    static TemperatureConverter getKelvinInstance() {
        return new KelvinConverter();
    }

    static TemperatureConverter getCelsiusInstance(){
        return new CelsiusConverter();
    }

    static void getNewTemp(String type, double temp) {
        switch (type) {
            case "Fahrenheit": {
                System.out.println(getFahrenheitInstance().convert(temp));
                break;
            }
            case "Kelvin": {
                System.out.println(getKelvinInstance().convert(temp));
                break;
            }
            case "Celsius": {
                System.out.println(getCelsiusInstance().convert(temp));
                break;
            }
            default:
                break;
        }
    }
}




