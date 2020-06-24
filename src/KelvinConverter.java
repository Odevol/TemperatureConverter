public class KelvinConverter implements TemperatureConverter{

    double temperature;

    public KelvinConverter (double temp){
        this.temperature = temp;
    }

    public KelvinConverter() {}

    @Override
    public double convert() {
        double temperature = this.temperature + 273.15;
        return temperature;
    }
}
