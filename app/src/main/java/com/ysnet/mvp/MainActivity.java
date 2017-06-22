package com.ysnet.mvp;

import android.os.Bundle;

import com.example.presenter.MainActivityPresenter;

public class MainActivity extends BasePresenterActivity<MainActivityPresenter.MainActivityView, MainActivityPresenter>
        implements MainActivityPresenter.MainActivityView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public MainActivityPresenter initPresenter() {
        return new MainActivityPresenter();
    }
}
