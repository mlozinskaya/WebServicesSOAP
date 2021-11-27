package com.example.producingwebservice;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import com.bootafoaga.webservicesdemo.Weather;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class WeatherRepository {
    private static final Map<String, Weather> weathers = new HashMap<>();

    @PostConstruct
    public void initData() {
        Weather moscow = new Weather();
        moscow.setName("Moscow");
        moscow.setTemperature(-5);
        moscow.setHumidity(80);
        moscow.setDescription("Overcast, light rain");

        weathers.put(moscow.getName(), moscow);

        Weather spb = new Weather();
        spb.setName("Saint-Petersburg");
        spb.setTemperature(3);
        spb.setHumidity(75);
        spb.setDescription("Clear, no precipitation");

        weathers.put(spb.getName(), spb);

        Weather novosibirsk = new Weather();
        novosibirsk.setName("Novosibirsk");
        novosibirsk.setTemperature(10);
        novosibirsk.setHumidity(85);
        novosibirsk.setDescription("Mostly cloudy at times");

        weathers.put(novosibirsk.getName(), novosibirsk);
    }

    public Weather findCity(String name) {
        Assert.notNull(name, "The city's name must not be null");
        return weathers.get(name);
    }
}