package com.google.android.gms.samples.vision.barcodereader;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EventService {
        //Retrofit turns our institute WEB API into a Java interface.
        //So these are the list available in our WEB API and the methods look straight forward

        //i.e. http://localhost/service/Events
        @GET("/service/Events")
        public void getEvents(Callback<List<Event>> callback);

        //i.e. http://localhost/service/Events/1
        //Get student record base on ID
        @GET("//service/Events/{id}")
        public void getEventById(@Path("id") Integer id,Callback<Event> callback);

        //i.e. http://localhost/service/Events/1
        //Delete student record base on ID
        @DELETE("/service/Events/{id}")
        public void deleteEventById(@Path("id") Integer id,Callback<Event> callback);

        //i.e. http://localhost/service/Events/1
        //PUT student record and post content in HTTP request BODY
        @PUT("/service/Events/{id}")
        public void updateEventById(@Path("id") Integer id,@Body Event student,Callback<Event> callback);

        //i.e. http://localhost/service/Events
        //Add student record and post content in HTTP request BODY
        @POST("/service/Events")
        public void addEvent(@Body Event student,Callback<Event> callback);
}