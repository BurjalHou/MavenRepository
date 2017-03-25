package com.burjal.maventest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.burjal.testaar.TestUtils;

public class MainActivity extends AppCompatActivity {

    private TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = (TextView) findViewById(R.id.txt);
        tvInfo.setText(TestUtils.getInfo());
    }
}
