package com.example.abidin.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

    }
    public void btn1Click(View view) {
        Intent tlp = new Intent (Intent.ACTION_DIAL, Uri.parse("tel:93675359"));
        startActivity(tlp); }
    public void btn2Click(View view) {
        Intent setting = new Intent( android.provider.Settings.ACTION_SETTINGS);
        startActivity(setting);
        Toast.makeText(this, "you have Pressed : " + btn2.getText() , Toast.LENGTH_LONG).show();
    }

}
