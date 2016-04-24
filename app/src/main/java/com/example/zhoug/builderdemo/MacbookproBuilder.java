package com.example.zhoug.builderdemo;

import android.app.AlertDialog;

/**
 * Created by zhoug on 2016/4/24.
 */
//具体的builder类
public class MacbookproBuilder extends  Builder {
    private  Computer computer = new MacbookProComputer();
    @Override
    public Builder builderBoard(String board) {
        computer.setBoard(board);
        return  this;

    }

    @Override
    public Builder builderDisplay(String display) {
      computer.setBoard(display);
        return this;
    }

    @Override
    public Builder builderOS(String os) {
        computer.setBoard(os);
        return  this;
    }

    @Override
    public Computer create() {
        return computer;



    }
}
