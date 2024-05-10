package com.tpe.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HavaDurumuResponse {

    private List<Weather> weather;
    private Main main;
    private Wind wind;


    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Weather {
        private String description;
    }

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Main {
        private double temp;
        private double temp_min;
        private double temp_max;
        private double pressure;
        private double humidity;
    }

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Wind {
        private double speed;

    }



}