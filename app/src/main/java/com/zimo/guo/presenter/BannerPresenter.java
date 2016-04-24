package com.zimo.guo.presenter;

import com.zimo.guo.activity.LoadingBannerView;
import com.zimo.guo.exception.NetworkConnectionException;
import com.zimo.guo.model.BannerVO;
import com.zimo.guo.network.service.HttpService;
import com.zimo.guo.rx.operator.OperatorRequestMap;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * @Description:
 * @author: zimo
 * @date: 2016-04-25
 */
public class BannerPresenter implements CommonPresenter {

    LoadingBannerView view;

    public BannerPresenter(LoadingBannerView view) {
        this.view = view;
    }

    @Override
    public void loadData() {
        HttpService.getInstance().getCommonApi().getBannerList("", "", "", "")
                .lift(new OperatorRequestMap<List<BannerVO>>())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<BannerVO>>() {
                    @Override
                    public void call(List<BannerVO> bannerVOs) {
                        if (bannerVOs != null && bannerVOs.size() > 0) {
                            view.showData(bannerVOs);
                        }else {
                            view.showEmptyView();
                        }
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        if (throwable instanceof NetworkConnectionException) {
                            view.showNetworkErrorView();
                        }
                    }
                });
    }
}
