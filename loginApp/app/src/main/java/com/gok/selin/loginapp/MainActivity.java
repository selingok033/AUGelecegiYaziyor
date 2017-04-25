package com.gok.selin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivLogo;
    EditText etName;
    EditText etPass;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivLogo = (ImageView) findViewById(R.id.imageViewLogo);  //R.java üzerinden bileşenleri anlamlı hale getiriyoruz :)
        etName = (EditText) findViewById(R.id.editTextName);

        etPass = (EditText) findViewById(R.id.editTextPassword);
        buttonLogin=(Button )findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();  //unutmayın bize dönen Text tipinde değer ve biz onu String'e çeviriyoruz
                String pass = etPass.getText().toString();

                if(name.equals("selin") && pass.equals("12345")){
                    Intent intent = new Intent(MainActivity.this,NotlarActivity.class);    //Niyetimizi belirityoruz :)
                    startActivity(intent);  //oluşturduğumuz niyeti başlatıyoruz
                }
                else if (!name.equals("selin")){
                    Toast.makeText(getApplicationContext(),"Kullanıcı adı hatalı",Toast.LENGTH_SHORT).show();
                }

                //Toast.makeText(getApplicationContext(),"Name: "+name+" Pass:"+pass,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
