package pl.hansonq.models;

/**
 * Created by lukasz on 2017-09-23.
 */
public class WeatherInfo {
    private double temp;
    private int pressure;


    public WeatherInfo(double temp, int pressure) {
        this.temp = temp;
        this.pressure = pressure;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;

    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;

    }
}
