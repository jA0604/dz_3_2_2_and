package com.androidakbar.dz_3_2_2_and;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Toolbar appToolbar;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        final ConstraintLayout clSimple = (ConstraintLayout) findViewById(R.id.cl_simple);
        final ConstraintLayout clScientific = (ConstraintLayout) findViewById(R.id.cl_scientific);
        Button btnView = (Button) findViewById(R.id.btn_ch_view);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clSimple.getVisibility() == View.VISIBLE) {
                    clSimple.setVisibility(View.GONE);
                    clScientific.setVisibility(View.VISIBLE);
                } else {
                    clSimple.setVisibility(View.VISIBLE);
                    clScientific.setVisibility(View.GONE);
                }
            }
        });
    }

    private void initView() {
        appToolbar = findViewById(R.id.app_toolbar);
        appToolbar.setTitle(R.string.name_dz);
        appToolbar.setTitleTextColor(getResources().getColor(R.color.colorPrimaryText));

        txtResult = findViewById(R.id.txt_result);
    }

    public void clickBtn(View view) {
        Button btn = (Button) view;
        txtResult.setText(btn.getText().toString());
    }
}