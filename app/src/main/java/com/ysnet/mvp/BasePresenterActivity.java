package com.ysnet.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.base.BasePresenter;

/**
 * Created by fan-gk on 2017/6/21.
 */

public abstract class BasePresenterActivity<V, T extends BasePresenter<V>> extends BaseActivity {
    private T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attach((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detach();
    }

    public abstract T initPresenter();
}
