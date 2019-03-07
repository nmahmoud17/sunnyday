package com.detroitlabs.sunnyday.service;

import com.detroitlabs.sunnyday.model.Forecast;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    public Forecast fetchWeatherData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.openweathermap.org/data/2.5/" +
                "weather?q=Detroit" +
                "&APPID=8ab972b7ea39cb3bd84ec5b9623d5e11", Forecast.class);

        //get resource at the URI and map to forecast class
    }

}
