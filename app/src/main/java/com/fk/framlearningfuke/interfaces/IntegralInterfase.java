package com.fk.framlearningfuke.interfaces;

public interface IntegralInterfase<T> {
    void onSuccess(T t, int isWhat);
    void onFail(String err);
}
