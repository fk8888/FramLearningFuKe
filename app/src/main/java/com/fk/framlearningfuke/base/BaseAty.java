package com.fk.framlearningfuke.base;

import android.os.Build;
import android.view.WindowManager;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.LifeCircleListener;

abstract public class BaseAty extends BaseActivity {
    @Override
    public void initViews() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    @Override
    public void setLifeCircleListener(LifeCircleListener lifeCircleListener) {
        super.setLifeCircleListener(lifeCircleListener);
        lifeCircleListener.onCreate();
        lifeCircleListener.onResume();
    }
}
//第一个是冷启动



//第二个是热启动
//第三个是我自己创建的渐变式启动



