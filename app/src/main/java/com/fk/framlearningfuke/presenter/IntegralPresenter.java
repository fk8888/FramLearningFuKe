package com.fk.framlearningfuke.presenter;

import com.fk.framlearningfuke.https.HttpUtils;
import com.fk.framlearningfuke.interfaces.IntegralInterfase;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;

//展示积分
public class IntegralPresenter extends BasePresenter<IntegralInterfase>{
    private final HttpUtils instance;

    public IntegralPresenter() {
        instance = HttpUtils.getInstance();
    }

    /*public void getintegral(HashMap<String, String> map) {
        instance.response.getintegral(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<IntegralBean>() {
                    @Override
                    public void accept(IntegralBean integralBean) throws Exception {
                        getView().onSuccess(integralBean,0);
                    }
                });
    }*/

}
