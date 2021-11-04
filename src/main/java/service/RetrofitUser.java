package service;

import models.ApiResponse;
import models.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Optional;

public interface RetrofitUser{

    @POST("user/createWithList")
    @Headers({"ContentType-Type: application/json"})
    Call<ApiResponse> createWithList (@Body List<User> user);

    @GET("user/{userName}")
    @Headers({"ContentType-Type: application/json"})
    Call<Optional<User>> getUserByUserName (@Path("userName") String userName);

    @PUT("user/{userName}")
    @Headers({"ContentType-Type: application/json"})
    Call<User> updateUserByUserName(User user, @Path("userName") String userName);

    @DELETE("user/{userName}")
    @Headers({"ContentType-Type: application/json"})
    Call<ApiResponse> deleteUser(@Path("userName") String userName);

    @GET("user/login")
    @Headers({"ContentType-Type: application/json"})
    Call<ApiResponse> userLogin(@Query("userName") String userName,
                         @Query("password") String password);

    @GET("user/logout")
    @Headers({"ContentType-Type: application/json"})
    Call<ApiResponse> userLogout();

    @POST("user/createWithArray")
    @Headers({"ContentType-Type: application/json"})
    Call<ApiResponse> createUserWithArray(@Body User[] users);

    @POST("user")
    @Headers({"ContentType-Type: application/json"})
    Call<User> addEntity(@Body User user);
}
