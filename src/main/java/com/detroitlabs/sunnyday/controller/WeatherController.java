package com.detroitlabs.sunnyday.controller;

import com.detroitlabs.sunnyday.model.Forecast;
import com.detroitlabs.sunnyday.model.BasicWeatherData;
import com.detroitlabs.sunnyday.model.Sys;
import com.detroitlabs.sunnyday.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ResponseBody
    @RequestMapping("/")
    public String displayWeather() {
        Forecast forecast = weatherService.fetchWeatherData();

        BasicWeatherData basicWeatherData = forecast.getBasicWeatherData();
        Sys sys = forecast.getSys();

        String temperatureString = String.valueOf(basicWeatherData.getConvertedTemp());
        String humidityString = String.valueOf(basicWeatherData.getHumidity());
        String sunriseTime = String.valueOf(sys.convertSunriseTime());
        String sunsetTime = String.valueOf(sys.convertSunsetTime());

        String sentence = ("The temperature in " + forecast.getName() + " is " + temperatureString + "F and the humidity is " + humidityString + "%" +
                " The sunrise is at " + sunriseTime + ". The sunset is at " +sunsetTime);
        return sentence;
    }
}
