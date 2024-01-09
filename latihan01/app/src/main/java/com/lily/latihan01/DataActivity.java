package com.lily.latihan01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataActivity extends AppCompatActivity {
    TextView dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        dr = (TextView)findViewById(R.id.tvDataRegister);
        String filename = "register.txt";
        StringBuffer stringBuffer = new StringBuffer();
        try {
/* Menambahkan BufferedReader untuk FileInputString dengan bantuan
InputStreamReader untuk membaca nilai */
            BufferedReader inputReader = new BufferedReader(new
                    InputStreamReader(openFileInput(filename)));
            String inputString;
// Membaca data per-baris dan mengirimkannya ke stringBuffer
            while ((inputString = inputReader.readLine()) != null) {
                stringBuffer.append(inputString + "\n");
            }
            dr.setText(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}