package com.fk.framlearningfuke.interfaces;

public interface MainIterface<T> {
    void onSuccess(T t, int isWhat);
    void onFail(String err);
}
