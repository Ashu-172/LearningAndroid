package com.mishra.ashutosh.magicidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btnSubmit;
    TextView tvResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.et_ID);
        btnSubmit = findViewById(R.id.btn_Submit);
        tvResults = findViewById(R.id.tv_Results);
        tvResults.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idNumber = etID.getText().toString().trim();  //South African ID Number
                if (idNumber.length() == 13) {
                    String DOB = getDOB(idNumber.substring(0, 6));
                    int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));
                    String sGender;
                    if (gender < 5)
                        sGender = getString(R.string.female);
                    else
                        sGender = getString(R.string.male);

                    int nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));
                    String sNationality;
                    if (nationality == 0)
                        sNationality = getString(R.string.ascitizen);
                    else
                        sNationality = getString(R.string.permanent);

                    String text = getString(R.string.dob) + DOB + "\n" +
                            getString(R.string.gender) + sGender + "\n" +
                            getString(R.string.nationality) + sNationality;
                    tvResults.setText(text);
                    tvResults.setVisibility(View.VISIBLE);
                }
                else{
                    tvResults.setText(getString(R.string.TV_invalid));
                    tvResults.setVisibility(View.VISIBLE);
                }
            }
            private String getDOB(String date) {
                return date.substring(4,6)+" / "+date.substring(2,4) + " / " + date.substring(0,2);
            }
        });
    }
}
