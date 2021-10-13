package com.midea.ac.weathertest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v3")
public class MainControllerV3 {

    @RequestMapping("/ac-weather/now/china_weather/get")
    public Object getChinaWeatherNow(){

        return null;
    }
}
