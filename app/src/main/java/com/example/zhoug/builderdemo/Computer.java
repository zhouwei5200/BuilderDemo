package com.example.zhoug.builderdemo;

/**
 * Created by zhoug on 2016/4/24.
 */
//电脑产品类
public class Computer {
    //CPU
    private String board;
    //内存
    private String display;
    private  String os;

    public void setBoard(String board) {
        this.board = board;
    }

    public String getBoard() {
        return board;
    }

    public String getDisplay() {
        return display;
    }

    public String getOs() {
        return os;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
