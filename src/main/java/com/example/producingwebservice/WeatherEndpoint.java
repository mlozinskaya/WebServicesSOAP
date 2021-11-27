package com.example.producingwebservice;

import com.bootafoaga.webservicesdemo.GetWeatherRequest;
import com.bootafoaga.webservicesdemo.GetWeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class WeatherEndpoint {
    private static final String NAMESPACE_URI = "http://bootafoaga.com/webservicesdemo";

    private WeatherRepository weatherRepository;

    @Autowired
    public WeatherEndpoint(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWeatherRequest")
    @ResponsePayload
    public GetWeatherResponse getWeather(@RequestPayload GetWeatherRequest request) {
        GetWeatherResponse response = new GetWeatherResponse();
        response.setName(weatherRepository.findCity(request.getCity()));

        return response;
    }
}