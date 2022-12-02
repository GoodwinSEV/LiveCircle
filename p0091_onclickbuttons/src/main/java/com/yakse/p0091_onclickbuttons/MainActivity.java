package com.yakse.p0091_onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener ocBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        View.OnClickListener ocBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };

        btnOk.setOnClickListener(ocBtnOk);
        btnCancel.setOnClickListener(ocBtnCancel);



    }
}