package com.fk.framlearningfuke.aty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fk.framlearningfuke.R;
import com.fk.framlearningfuke.base.BaseAty;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;

import java.util.zip.Inflater;


@Layout(R.layout.activity_home_aty)
public class HomeAty extends BaseAty {

//    用户点击 icon
//    系统开始加载和启动应用
//    应用启动：开启空白(黑色)窗口
//    创建应用进程
//            初始化Application
//    启动 UI 线程
//    创建第一个 Activity
//    解析(Inflater)和加载内容视图
//    布局(Layout)
//    绘制(Draw)
//    解决方案
//
//    首先要明确的一点就是：冷启动无法避免，我们只能去减少冷启动的时间和适配冷启动。
//    如何减少冷启动的时间？
//
//    其实这个问题等同于如何减少应用初始化的时间，从上面的APP启动流程中，如果我们在应用初始化的操作越多，那么从初始化到绘制的时间越长，用户看到真实界面的时间也就越长，可以从如下几个方面进行：
//
//    减少在 Application 中的耗时操作(懒加载)
//    减少在 onCreate 的耗时操作





    @Override
    public void initViews() {

    }

    @Override
    public void initDatas(JumpParameter parameter) {

    }

    @Override
    public void setEvents() {

    }
}
