package com.ajoumutjin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivty extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activty);
    }
    public void goCR(View v){
        //챗팅 액티비티가 실행되도록 한다.(명시적 인텐트)(현재 엑티비티, 실행할 엑티비티)
        Intent intent = new Intent(this, aware.class);
        //startActivity()메소드를 호출하면서 인자로 전달하면 실행된다.
        startActivity(intent);

    }
}
