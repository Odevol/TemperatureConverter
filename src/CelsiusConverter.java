public class CelsiusConverter implements TemperatureConverter{

    double temperature;

    public CelsiusConverter(double temp){
        this.temperature = temp;
    }

    public CelsiusConverter(){}

    @Override
    public double convert() {
        return this.temperature;
    }
}
