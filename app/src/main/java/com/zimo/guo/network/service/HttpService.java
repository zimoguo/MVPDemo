package com.zimo.guo.network.service;

import com.zimo.guo.BuildConfig;
import com.zimo.guo.constants.HttpContants;
import com.zimo.guo.network.api.CommonApi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Description: http
 * @author: zimo
 * @date: 2016-04-24
 */
public class HttpService {

    private CommonApi commonApi;

    private HttpService() {
        Retrofit.Builder builder = new Retrofit.Builder().addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(HttpContants.DEFAULT_HOST_URL);
        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder().addNetworkInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Request newReq = request.newBuilder()
                        .build();
                return chain.proceed(newReq);
            }
        });

        if (BuildConfig.DEBUG){
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpBuilder.addInterceptor(loggingInterceptor);
        }

        OkHttpClient client = okHttpBuilder.build();
        builder.client(client);
        commonApi = builder.build().create(CommonApi.class);
    }

    private static class HttpServiceHandler{
        public static final HttpService INSTANCE = new HttpService();
    }

    public static HttpService getInstance(){
        return HttpServiceHandler.INSTANCE;
    }

    public static CommonApi getCommonApi() {
        return HttpService.getInstance().commonApi;
    }
}
