package com.example.myshoppinglistapp

import com.google.android.gms.common.api.Status

data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class Geocodingresponse(
    val results: List<GeocodingResult>,
    val status: String
)

data class GeocodingResult(
    val formatted_address: String
)