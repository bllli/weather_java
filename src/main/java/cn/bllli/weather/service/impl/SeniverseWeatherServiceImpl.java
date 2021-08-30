package cn.bllli.weather.service.impl;

import cn.bllli.weather.service.WeatherService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SeniverseWeatherServiceImpl implements WeatherService {
    @Override
    public GetWeatherDescriptionOutputDto getWeatherDescription(Date date, String CityId) throws WeatherServiceException {
        GetWeatherDescriptionOutputDto o = new GetWeatherDescriptionOutputDto();
        o.setWeatherDescription("Test");
        return o;
    }
}
