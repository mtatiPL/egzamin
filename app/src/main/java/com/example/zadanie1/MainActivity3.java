package com.example.zadanie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    int nr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nr=0;
        setContentView(R.layout.activity_main3);
        SeekBar seekBar=findViewById(R.id.rozmiarS);
        TextView text=findViewById(R.id.rozmiarT);
        TextView textView=findViewById(R.id.textView5);
        Button button=findViewById(R.id.button4);
      String[] witam=new String[3];
      witam[0]="Dzień dobry";
      witam[1]="Good morning";
      witam[2]="Buenos dias";
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                text.setText("Rozmiar: "+String.valueOf(progress));

                textView.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nr == 0){
                    textView.setText(witam[1]);
                nr=1;
                }
                else if(nr==1){
                    textView.setText(witam[2]);
                    nr=2;
                }
                else if(nr==2){
                    textView.setText(witam[0]);
                    nr=0;
                }


            }
        });

    }
}