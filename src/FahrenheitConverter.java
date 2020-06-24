public class FahrenheitConverter implements TemperatureConverter{

    double temperature;

    public FahrenheitConverter (double temp){
        this.temperature = temp;
    }

    public FahrenheitConverter() {}


    @Override
    public double convert() {
        double temperature = (this.temperature * 9) / 5 + 32;
        return temperature;
    }
}
