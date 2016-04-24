package com.zimo.guo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zimo.guo.R;
import com.zimo.guo.model.BannerVO;
import com.zimo.guo.presenter.BannerPresenter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements LoadingBannerView {

    @Bind(R.id.show_banner_string)
    TextView showBanner;

    BannerPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new BannerPresenter(MainActivity.this);
        presenter.loadData();
    }

    @Override
    public void showData(List<BannerVO> bannerVOs) {
        showBanner.setText(bannerVOs.get(0).getPicUrl());
    }

    @Override
    public void showNetworkErrorView() {

    }

    @Override
    public void hideNetworkErrorView() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showEmptyView() {

    }

    @Override
    public void hideEmptyView() {

    }

    @Override
    public void showError(String message) {

    }
}
