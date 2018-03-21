package com.example.abidin.eventhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById (R.id.textView1);
        button1 = (Button) findViewById (R.id.button1);
    }

    public void button1Click(View view){
        textView1.setText("Clicked Button");
    }
}
