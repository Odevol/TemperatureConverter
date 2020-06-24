public interface TemperatureConverter {

    double convert();

    static TemperatureConverter getFahrenheitInstance() {
        return new FahrenheitConverter();
    }
    static TemperatureConverter getKelvinInstance(){
        return new KelvinConverter();
    }
}

