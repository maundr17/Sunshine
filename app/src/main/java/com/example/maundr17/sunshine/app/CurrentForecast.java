package com.example.maundr17.sunshine.app;


public class CurrentForecast {

    private String weatherData;
    private String humidity;
    private String pressure;
    private String wind;

    public CurrentForecast(String weatherData, String humidity, String pressure, String wind) {
        this.weatherData = weatherData;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
    }

    public CurrentForecast() {

    }


    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(String weatherData) {
        this.weatherData = weatherData;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
