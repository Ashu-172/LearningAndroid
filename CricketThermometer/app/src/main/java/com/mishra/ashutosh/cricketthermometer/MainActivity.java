package com.mishra.ashutosh.cricketthermometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etFreq;
    Button btnSubmit;
    TextView tvResult;
    DecimalFormat format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFreq = findViewById(R.id.et_freq);
        btnSubmit = findViewById(R.id.btn_Submit);
        tvResult = findViewById(R.id.tv_Result);
        tvResult.setVisibility(View.GONE);

        format = new DecimalFormat("#0.0");
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sInput = etFreq.getText().toString().trim();
                if(!sInput.isEmpty()){
                    double temperature = (Integer.parseInt(sInput)/3.0 )+4;
                    tvResult.setText(getString(R.string.str1)+format.format(temperature)+getString(R.string.str2));
                    tvResult.setVisibility(View.VISIBLE);
                    etFreq.setText("");
                }
                else
                    Toast.makeText(MainActivity.this,"Please Enter AllFields",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
