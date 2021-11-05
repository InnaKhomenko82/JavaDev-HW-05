package service;

import models.ApiResponse;
import models.Order;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.Optional;

public interface RetrofitOrder {

    @GET("store/inventory")
    @Headers({"ContentType-Type: application/json"})
    Call<Map<String, Integer>> getInventory();

    @POST("store/order")
    @Headers({"ContentType-Type: application/json"})
    Call<Order> addEntity(@Body Order order);

    @GET("store/order/{orderId}")
    @Headers({"ContentType-Type: application/json"})
    Call<Order> getEntity(@Path("orderId") Long orderId);

    @DELETE("store/order/{orderId}")
    @Headers({"Content-Type: application/json"})
    Call<ApiResponse> deleteEntity(@Path("orderId") Long orderId);
}
