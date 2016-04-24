package com.zimo.guo.network.api;


import com.zimo.guo.model.BannerVO;
import com.zimo.guo.model.BaseBean;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * @Description:
 * @author: zimo
 * @date: 2016-04-24
 */
public interface CommonApi {

    @FormUrlEncoded
    @POST("/EPocketServlet/JsonServlet")
    Observable<BaseBean<List<BannerVO>>> getBannerList(@Field("") String method, @Field("") String bannerUpdateVer, @Field("") String sessionKey,
                                                       @Field("") String bannerType);
}
