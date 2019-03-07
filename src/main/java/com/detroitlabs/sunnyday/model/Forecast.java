package com.detroitlabs.sunnyday.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//any property that doesn't match, this annotation ignores it
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String name;
    private BasicWeatherData basicWeatherData;
    private Sys sys;

    @JsonProperty("main")
    public BasicWeatherData getBasicWeatherData() {
        return basicWeatherData;
    }

    @JsonProperty("main")
    public void setBasicWeatherData(BasicWeatherData basicWeatherData) {
        this.basicWeatherData = basicWeatherData;
    }

    @JsonProperty("sys")
    public Sys getSys() {
        return sys;
    }

    @JsonProperty("sys")
    public void setSys(Sys sys) {
        this.sys = sys;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
