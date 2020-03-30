package com.fk.framlearningfuke;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.fk.framlearningfuke.aty.BaseAty;
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
@DarkStatusBarTheme(true)           //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255,r = 255,g = 255,b = 255)
@DarkNavigationBarTheme(true)       //开启底部导航栏按钮暗色模式
public class MainActivity extends BaseAty {

    TextView text_finish;

    @Override
    public void initViews() {
        text_finish = findViewById(R.id.text_finish);
        me.getStatusBarHeight();
    }

    @Override
    public void initDatas(JumpParameter parameter) {

    }

    @Override
    public void setEvents() {
        text_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(me, "返回", Toast.LENGTH_SHORT).show();
            }
        });
    }
}