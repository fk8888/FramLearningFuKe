package com.fk.framlearningfuke;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.fk.framlearningfuke.aty.HomeAty;
import com.fk.framlearningfuke.base.BaseAty;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;


/**
 * @author NineTailDemonFox
 * @date or 2020/3/30 22:39
 * 功能描述： 这个是主页面
 * 联系方式：1037438704@qq.com
 */
@Layout(R.layout.activity_main)
@DarkStatusBarTheme(true)//开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255,r = 255,g = 255,b = 255)
@DarkNavigationBarTheme(true)//开启底部导航栏按钮暗色模式
public class MainActivity extends BaseAty {

    @Override
    public void initViews() {

    }

    @Override
    public void initDatas(JumpParameter parameter) {

    }

    @Override
    public void setEvents() {

    }

    public void onClick(View view) {
        jump(HomeAty.class);
    }
}