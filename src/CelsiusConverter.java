public class CelsiusConverter implements TemperatureConverter{

    double temperature;

    public CelsiusConverter(double temperature){
        this.temperature = temperature;
    }

    public CelsiusConverter(){}

    @Override
    public double convert() {
        return this.temperature;
    }
}
