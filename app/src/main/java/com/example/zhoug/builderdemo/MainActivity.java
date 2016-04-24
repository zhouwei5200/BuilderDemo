package com.example.zhoug.builderdemo;



import android.app.Activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Builder builder = new MacbookproBuilder();
       Computer computer =  builder.builderBoard("inter").builderOS("os").builderDisplay("显示屏").create();
        Director director = new Director(builder);
        director.contruct("inter","显示屏");

        final AlertDialog.Builder  alertDialog = new AlertDialog.Builder(this);




        alertDialog.setTitle("标题").setMessage("内容").setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.create();
        alertDialog.show();

    }
}
