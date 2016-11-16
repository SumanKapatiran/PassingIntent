package com.example.jerem.passingintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView nameView= (TextView) findViewById(R.id.result_txt);
        nameView.setText(getIntent().getExtras().getString("userName"));
    }
}
