package service;

import models.ApiResponse;
import models.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RetrofitUser{

    @POST("user/createWithList")
    @Headers({"ContentType-Type: application/json"})
    Call<ApiResponse> createWithList (@Body List<User> user);

    @GET("user/{userName}")
    @Headers({"ContentType-Type: application/json"})
    Call<User> getUserByUserName (@Path("userName") String userName);

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

    @POST("user/createUser")
    @Headers({"ContentType-Type: application/json"})
    Call<User> addEntity(@Body User user);
}
