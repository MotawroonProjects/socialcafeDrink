package com.socialcafedrink.services;


import com.socialcafedrink.models.OrderDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("api/getOrderByType")
    Call<OrderDataModel> getOrders(
            @Query("type") String type
    );
}