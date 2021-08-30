package cn.bllli.weather.service;

import lombok.Data;

import java.util.Date;

public interface WeatherService {

    public class WeatherServiceException extends Exception{}
    public class RemoteApiError extends WeatherServiceException {}

    @Data
    class GetWeatherDescriptionOutputDto {
        String cityId;
        Date date;
        String weatherDescription;
    }

    public GetWeatherDescriptionOutputDto getWeatherDescription(Date date, String CityId) throws WeatherServiceException;
}
