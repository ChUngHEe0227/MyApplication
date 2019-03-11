package com.ajoumutjin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 이충희 on 2017-04-11.
 */

public class ChoosAcyivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면을 chat.xml로 지정
        setContentView(R.layout.choseroot);

    }

    //액티비티 종료 버튼을 눌렀을때 호출되는 메소드
    public void next(View v){
        //현재 액티비티를 종료시켜라(destroy:메모리에서 사라짐)
        finish();
    }
}
