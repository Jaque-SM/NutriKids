package com.example.nutrikids;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cadastro_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }


    public void loginNutri(View view){
        Intent intent = new Intent(getApplicationContext(),TelaLoginActivity2_nutri.class);
        startActivity(intent);
    }

}