package com.zimo.guo.activity;

import com.zimo.guo.model.BannerVO;

import java.util.List;

/**
 * @Description:
 * @author: zimo
 * @date: 2016-04-25
 */
public interface LoadingBannerView extends LoadingDataView{

    void showData(List<BannerVO> bannerVOs);
}
