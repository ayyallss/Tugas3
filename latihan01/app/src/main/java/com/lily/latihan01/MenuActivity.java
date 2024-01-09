package com.lily.latihan01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    Button bt_logout;
    TextView nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bt_logout = (Button)findViewById(R.id.bt_logout);
        nama = (TextView)findViewById(R.id.tv_namaMain);
        /* Mengatur nilai Label Nama dengan data User sedang login dari  Preferences */
        nama.setText(Preferences.getLoggedInUser(getBaseContext()));
    }
    public void openRegister(View v) {
        Intent intent = new Intent(MenuActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
    public void showRegister(View v) {
        Intent intent = new Intent(MenuActivity.this, DataActivity.class);
        startActivity(intent);
    }
    public void showRegister2(View v) {
        Intent intent = new Intent(MenuActivity.this, DataExternalActivity.class);
        startActivity(intent);
    }
    public void logout(View v) {
        //Menghapus Status login dan kembali ke Login Activity
        Preferences.clearLoggedInUser(getBaseContext());
        startActivity(new Intent(getBaseContext(), LoginActivity.class));
        finish();
    }
}