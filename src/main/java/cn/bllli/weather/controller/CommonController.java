package cn.bllli.weather.controller;

import cn.bllli.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class CommonController {

    @Resource
    WeatherService weatherService;

    @GetMapping(path = "/")
    public String helloWorld() {
        String fail = "Error!";
        try {
            WeatherService.GetWeatherDescriptionOutputDto o = weatherService.getWeatherDescription(new Date(), "1000");
            if (o != null && o.getWeatherDescription() != null) {
                return o.getWeatherDescription();
            } else {
                return fail;
            }
        } catch (WeatherService.WeatherServiceException e) {
            e.printStackTrace();
            return fail;
        }
        // return "Hello Weather!";
    }
}
