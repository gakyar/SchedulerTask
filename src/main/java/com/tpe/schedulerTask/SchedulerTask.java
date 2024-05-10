package com.tpe.schedulerTask;

import com.tpe.domain.HavaDurumuResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SchedulerTask {

    private static final Logger log = LoggerFactory.getLogger(SchedulerTask.class);
    private final RestTemplate restTemplate = new RestTemplate();
    //RestTemplate, clietmış gibi davranıp request göndermeyi sağlıyor, bir kere new'lenir,

    @Value("${app.weather.api.key}")
    private String apiKey;

    @Scheduled(fixedRate = 10000) // her 10 saniyede bir bu method tetiklensin
    public void havaDurumuBilgisiniGetir() {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Sanliurfa&appid=" + apiKey + "&units=metric&lang=tr";
        HavaDurumuResponse response = restTemplate.getForObject(url, HavaDurumuResponse.class);

        if (response != null) {
            log.info("Sanliurfa icin hava durumu : {}, Sicaklik: {}, Rüzgar:{}",
                    response.getWeather().get(0).getDescription(),
                    response.getMain().getTemp(),
                    response.getWind().getSpeed());


        }
    }
}