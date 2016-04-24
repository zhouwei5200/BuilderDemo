package com.example.zhoug.builderdemo;

/**
 * Created by zhoug on 2016/4/24.
 */
public class Director {
    //用于组装
    Builder builder = null;

    public  Director(Builder builder){
        this.builder = builder;}
    public void contruct(String board,String display){
        this.builder.builderBoard(board);
        this.builder.builderDisplay(display);
        this.builder.builderOS(null);
    }
}

