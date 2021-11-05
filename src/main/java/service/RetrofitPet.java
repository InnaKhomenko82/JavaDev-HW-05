package service;

import models.ApiResponse;
import models.Pet;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RetrofitPet {

    @Multipart
    @POST("pet/{petId}/uploadImage")
    @Headers({"ContentType-Type: application/json"})
    Call<ApiResponse> uploadPetImage(@Path("petId") Long id, @Part MultipartBody.Part filePart,
                                     @Part MultipartBody.Part additionalMetadata);

    @POST("pet")
    @Headers({"ContentType-Type: application/json"})
    Call<Pet> addEntity (@Body Pet pet);

    @PUT("pet")
    @Headers({"Content-Type: application/json"})
    Call<Pet> updateEntity(@Body Pet pet);

    @GET("pet/findByStatus")
    @Headers({"Content-Type: application/json"})
    Call<List<Pet>> getPetByStatus(@Query("status") String[] status);

    @GET("pet/{petId}")
    @Headers({"Content-Type: application/json"})
    Call<Pet> getEntity(@Path("petId") Long id);

    @FormUrlEncoded
    @POST("pet/{petId}")
    @Headers({"Content-Type: application/json"})
    Call<ApiResponse> updatePetById(@Path("petId") Long id, @Field("name") String name,
                                    @Field("status") String status);

    @DELETE("pet/{petId}")
    @Headers({"Content-Type: application/json"})
    Call<ApiResponse> deleteEntity(@Path("petId") Long id);
}
