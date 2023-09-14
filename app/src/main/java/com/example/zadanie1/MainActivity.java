package com.example.zadanie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int  polubienia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button like=findViewById(R.id.button);
        Button usun=findViewById(R.id.button2);
        TextView liky=findViewById(R.id.liky);
        polubienia=0;



        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                polubienia++;

                String text=String.valueOf(polubienia);;
                liky.setText(text+ " polubienia");

            }
        });
        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (polubienia>0)
                polubienia--;
                else
                    polubienia=0;

                String text=String.valueOf(polubienia);;
                liky.setText(text+ " polubienia");
            }
        });


    }


}