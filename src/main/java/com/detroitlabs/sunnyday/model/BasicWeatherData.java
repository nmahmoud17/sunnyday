package com.detroitlabs.sunnyday.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.DecimalFormat;

@JsonIgnoreProperties(ignoreUnknown = true)

public class BasicWeatherData {

    private double temp;
    private int humidity;


    public double getTemp() {
        return temp;
    }

    public String getConvertedTemp(){
        DecimalFormat dF = new DecimalFormat();
        double tempF = (getTemp() - 273.15) * 1.8 + 32;
        return dF.format(tempF);
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
