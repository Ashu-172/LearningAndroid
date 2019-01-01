package com.mishra.ashutosh.explicitintent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnAct2,btnAct3;
    TextView tvResult;
    final int ACTIVITY3 = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btnAct2 = findViewById(R.id.btnAct2);
        btnAct3 = findViewById(R.id.btnAct3);
        tvResult = findViewById(R.id.tvResult);

        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please  Enter All Text!", Toast.LENGTH_SHORT).show();
                }
                else{
                    String name = etName.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,com.mishra.ashutosh.explicitintent.Activity2.class);
                    intent.putExtra("Name",name);
                    startActivity(intent);
                }
            }
        });

        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,com.mishra.ashutosh.explicitintent.Activity3.class);
                startActivityForResult(intent,ACTIVITY3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==ACTIVITY3){
            if(resultCode==RESULT_OK){
                tvResult.setText(data.getStringExtra("Surname"));
            }
            if(resultCode==RESULT_CANCELED){
                tvResult.setText("No Data Received..!");
            }
        }
    }
}
