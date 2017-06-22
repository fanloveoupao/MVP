package com.example.base;

/**
 * Created by fan-gk on 2017/6/21.
 */

public class BasePresenter<T> {
    private T view;

    public void attach(T view) {
        this.view = view;
    }

    public void detach() {
        this.view = null;
    }

    public T getView() {
        return view;
    }
}
