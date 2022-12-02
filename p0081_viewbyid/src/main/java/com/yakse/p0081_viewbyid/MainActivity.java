package com.yakse.p0081_viewbyid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        Button myBtn = (Button) findViewById(R.id.myBtn);
        CheckBox myChb = (CheckBox) findViewById(R.id.myChb);

        myTextView.setText("New text in TextView");
        myBtn.setText("My button");
        myBtn.setEnabled(false);
        myChb.setChecked(true);

    }
}