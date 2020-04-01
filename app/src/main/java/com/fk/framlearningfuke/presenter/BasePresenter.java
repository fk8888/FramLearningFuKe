package com.fk.framlearningfuke.presenter;

public class BasePresenter<T> {
    private T view;

    public void setView(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }

    public void detachView(){
        this.view = null;
    }
}
