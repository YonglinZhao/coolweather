package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 赵泳霖 on 2017/12/8.
 */

public class Basic {


    @SerializedName("city")//JSON字段和java字段建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{

        @SerializedName("loc")
        public  String updateTime;
    }
}
