package com.google.android.gms.samples.vision.barcodereader;

import retrofit2.Retrofit;

public class RestService {
    //You need to change the IP if you testing environment is not local machine
    //or you may have different URL than we have here
    private static final String URL = "http://qreader.somee.com/api/";
    private Retrofit restAdapter;
    private EventService apiService;

    public RestService()
    {
        restAdapter = new Retrofit.Builder()
                .baseUrl(URL)
                .build();

        apiService = restAdapter.create(EventService.class);
    }

    public EventService getService()
    {
        return apiService;
    }
}
