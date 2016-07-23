package com.leohan.viewinject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.button)
    private Button button1;
    @ViewInject(R.id.button2)
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewInjectUtils.inject(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(MainActivity.this, "button 1 clicked!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Toast.makeText(MainActivity.this, "button 2 clicked!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
