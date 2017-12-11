package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 赵泳霖 on 2017/12/8.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;

        public  String min;
    }

    public class More {
        @SerializedName("tex_d")
        public String info;
    }


}
