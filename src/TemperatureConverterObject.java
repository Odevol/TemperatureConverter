import java.util.Scanner;

public class TemperatureConverterObject {

    String country;
    double temperature;
    String type = "Единицы измерения температуры не определены";

    String fahrenheit[] = new String[]{"USA", "GB"};
    String kelvin[] = new String[]{"Phisics", "Science"};
    String celsius[] = new String[]{"Russia"};

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getType(){
        for (String fahrenheit : fahrenheit) {
            if (this.country.equals(fahrenheit)) {
                this.type = "Fahrenheit";
            }
        }
        for (String kelvin : kelvin) {
            if (this.country.equals(kelvin)) {
                this.type = "Kelvin";
            }
        }
        for (String celsius : celsius){
            if (this.country.equals(celsius)){
                this.type = "Celsius";
            }
        }
        return this.type;
    }
    public String getCountry () {
        return this.country;
    }
    public double getTemperature () {
        return this.temperature;
    }
}