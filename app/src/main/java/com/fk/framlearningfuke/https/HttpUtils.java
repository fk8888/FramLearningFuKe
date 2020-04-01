package com.fk.framlearningfuke.https;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @Auther: fuke
 * @Date: 2020/4/1  12:02:21
 * @Description:
 */
public class HttpUtils {

    //接口公共部分
    private String baseUrl = "https://mobile.bwstudent.com/techApi/";
    public final RetrofitResponse response;

    private HttpUtils(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.SECONDS)
                .readTimeout(5000, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder()
                                //.addHeader("userId","396")
                                //.addHeader("sessionId","1557407075892396")
                                .build();
                        Log.e("interceptor","request:"+request.toString());

                        Response proceed = chain.proceed(request);
                        return proceed;
                    }
                })
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        response = retrofit.create(RetrofitResponse.class);
    }

    public static HttpUtils getInstance() {
        return HttpUtilsInstance.httpUtils;
    }

    private static class HttpUtilsInstance{
        private static HttpUtils httpUtils = new HttpUtils();
    }
}
