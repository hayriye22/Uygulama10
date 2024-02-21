package com.hayriye.uygulama10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Asker asker;
    public Tankci tankci;
    String mesaj="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asker =new Asker();
        tankci=new Tankci();
        TextView textViewmesaj=findViewById(R.id.textView);
        Button buttonasker=findViewById(R.id.button);
        Button buttontank=findViewById(R.id.button2);
        buttonasker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj=asker.atesEt();
                textViewmesaj.setText(mesaj);

            }
        });
        buttontank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj=tankci.atesEt();
                textViewmesaj.setText(mesaj);
            }
        });
    }
}