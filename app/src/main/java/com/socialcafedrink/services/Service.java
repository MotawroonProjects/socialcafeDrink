package com.socialcafedrink.services;


import com.socialcafedrink.models.OrderDataModel;
import com.socialcafedrink.models.StatusResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("api/getOrderByType")
    Call<OrderDataModel> getOrders(
            @Query("type") String type
    );
    @GET("api/endMake")
    Call<StatusResponse> endOrder(
            @Query("product_sale_id") String product_sale_id
    );
}