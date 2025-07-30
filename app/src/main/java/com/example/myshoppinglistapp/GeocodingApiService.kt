package com.example.myshoppinglistapp

import com.google.android.gms.common.api.internal.ApiKey
import com.google.android.gms.maps.model.LatLng
import retrofit2.http.Query

interface GeocodingApiService {

    suspend fun getAddressFromCoordinates(
        @Query("latlng")latLng:String,
        @Query("key")apiKey: String
    ): Geocodingresponse

}