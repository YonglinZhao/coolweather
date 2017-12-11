package com.example.coolweather.gson;

/**
 * Created by 赵泳霖 on 2017/12/8.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
