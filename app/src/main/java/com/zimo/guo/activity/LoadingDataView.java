package com.zimo.guo.activity;

import java.util.List;

/**
 * @Description: 加载数据
 * @author: zimo
 * @date: 2016-04-06
 */
public interface LoadingDataView {

    void showNetworkErrorView();

    void hideNetworkErrorView();

    void showLoading();

    void hideLoading();

    void showEmptyView();

    void hideEmptyView();

    void showError(String message);
}
