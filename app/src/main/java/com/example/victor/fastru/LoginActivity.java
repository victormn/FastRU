package com.example.victor.fastru;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    // @TODO: Tela "Pagamento"
    // @TODO: Ver como será a transição da última tela para a principal

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
    }

    public void onIniciarClick(View view) {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }
}
