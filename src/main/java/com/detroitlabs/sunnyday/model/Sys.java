package com.detroitlabs.sunnyday.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Instant;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Sys {

    private long sunrise;
    private long sunset;
    private Date time = new Date();


    public Date convertSunriseTime(){
        time = Date.from(Instant.ofEpochSecond(sunrise));
        return time;

    }
    public Date convertSunsetTime(){
        time = Date.from(Instant.ofEpochSecond(sunset));
        return time;

    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }
}
