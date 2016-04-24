package com.example.zhoug.builderdemo;

/**
 * Created by zhoug on 2016/4/24.
 */
//定义电脑Builder类  抽象  规范产品
public abstract class Builder {
    //设置主机
    public abstract Builder builderBoard(String board);
    //设置内存
    public  abstract  Builder builderDisplay(String display);
    //设置系统
    public  abstract  Builder builderOS(String os);
    //创建产品
    public  abstract  Computer  create();
}

