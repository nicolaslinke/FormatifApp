package com.example.formatifappmobile_2.http;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitUtil {

    private static Service service;
    public static Service get() {
        if (service == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .baseUrl("http://10.0.2.2:8080/")
                    //.baseUrl("https://kickmyb-server-3zpw.onrender.com/")
                    .build();
            service = retrofit.create(Service.class);
            return service;
        }
        else return service;
    }
}
