package com.example.jerem.passingintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class PassingIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intent);
        final EditText et = (EditText) findViewById(R.id.someUserText);
        Button b = (Button) findViewById(R.id.go_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(PassingIntent.this, Second.class);
                intent.putExtra("userName", et. getText().toString());
                startActivity(intent);
            }
        });
    }
}
