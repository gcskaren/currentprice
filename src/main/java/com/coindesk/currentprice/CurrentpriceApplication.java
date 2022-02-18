package com.coindesk.currentprice;

import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Retrofit;
@SpringBootApplication
public class CurrentpriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrentpriceApplication.class, args);
    }
    OkHttpClient.Builder httpClient= new OkHttpClient.Builder();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.coindesk.com/v1/bpi/currentprice.json")
            .build();

}
