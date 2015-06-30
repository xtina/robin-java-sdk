package com.robinpowered.sdk.service;

import com.robinpowered.sdk.model.ApiResponse;
import com.robinpowered.sdk.model.Event;
import com.robinpowered.sdk.model.User;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.QueryMap;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface EventService {

    // Sync
    @GET("/events/{eventId}")
    ApiResponse<Event> getEvent(@Path("eventId") int eventId, @QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/events/{eventId}")
    void getEvent(@Path("eventId") int eventId, @QueryMap Map<String, Object> options, Callback<ApiResponse<Event>> callback);


    /**
     * For locations
     */

    // Sync
    @GET("/locations/{locationId}/events")
    ApiResponse<List<Event>> getLocationEvents(@Path("locationId") int locationId, @QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/locations/{locationId}/events")
    void getLocationEvents(@Path("locationId") int locationId, @QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);


    /**
     * For spaces
     */

    // Sync
    @GET("/spaces/{spaceId}/events")
    ApiResponse<List<Event>> getSpaceEvents(@Path("spaceId") int spaceId, @QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/spaces/{spaceId}/events")
    void getSpaceEvents(@Path("spaceId") int spaceId, @QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);

    // Sync
    @GET("/spaces/{spaceId}/events/upcoming")
    ApiResponse<List<Event>> getUpcomingSpaceEvents(@Path("spaceId") int spaceId, @QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/spaces/{spaceId}/events/upcoming")
    void getUpcomingSpaceEvents(@Path("spaceId") int spaceId, @QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);

    // Sync
    @GET("/spaces/{spaceId}/events/recent")
    ApiResponse<List<Event>> getRecentSpaceEvents(@Path("spaceId") int spaceId, @QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/spaces/{spaceId}/events/recent")
    void getRecentSpaceEvents(@Path("spaceId") int spaceId, @QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);

    // Sync
    @POST("/spaces/{spaceId}/events")
    ApiResponse<Event> bookSpace(@Path("spaceId") int spaceId, @Body Event.Booking eventBooking) throws IOException;

    // Async
    @POST("/spaces/{spaceId}/events")
    void bookSpace(@Path("spaceId") int spaceId, @Body Event.Booking eventBooking, Callback<ApiResponse<Event>> callback);


    /**
     * For users
     */

    // Sync
    @GET("/users/{id}/events")
    ApiResponse<List<Event>> getUserEvents(@Path("id") User.Reference id, @QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/users/{id}/events")
    void getUserEvents(@Path("id") User.Reference id, @QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);

    // Sync
    @GET("/me/events")
    ApiResponse<List<Event>> getMyEvents(@QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/me/events")
    void getMyEvents(@QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);

    // Sync
    @GET("/me/events/upcoming")
    ApiResponse<List<Event>> getMyUpcomingEvents(@QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/me/events/upcoming")
    void getMyUpcomingEvents(@QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);

    // Sync
    @GET("/me/events/recent")
    ApiResponse<List<Event>> getMyRecentEvents(@QueryMap Map<String, Object> options) throws IOException;

    // Async
    @GET("/me/events/recent")
    void getMyRecentEvents(@QueryMap Map<String, Object> options, Callback<ApiResponse<List<Event>>> callback);
}
