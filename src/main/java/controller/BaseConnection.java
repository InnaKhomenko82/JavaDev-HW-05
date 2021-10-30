package controller;

import retrofit2.converter.gson.GsonConverterFactory;
import util.RetrofitConfig;
import util.PropertiesLoader;

public class BaseConnection {
    private static final String BASE_URL = PropertiesLoader.getProperty("url");

    public static <T> T retrofitClient (Class<T> clientClass){
        T client = RetrofitConfig.createClient(BASE_URL,
                GsonConverterFactory.create(), clientClass);
        return client;
    }
}
