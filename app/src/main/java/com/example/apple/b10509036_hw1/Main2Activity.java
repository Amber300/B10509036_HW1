package com.example.apple.b10509036_hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = this.getIntent().getExtras();
        String saying = bundle.getString("saying");
        saying = "B10509036's enter is: " + saying;

        TextView tv01 = (TextView)findViewById(R.id.textView);
        tv01.setText(saying);
    }
}
