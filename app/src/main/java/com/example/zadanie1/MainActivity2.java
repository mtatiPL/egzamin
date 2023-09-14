package com.example.zadanie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button dodaj=findViewById(R.id.dodaj);
        EditText editText =findViewById(R.id.editTextTextPersonName);
        ListView listView=findViewById(R.id.lista);
        ArrayList<String> listaZak=new ArrayList<String>();
      ArrayAdapter adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listaZak);
listaZak.add("Zakupy: chelb, masło, ser");
listaZak.add("Do zrobienia: obiad, umyć podłogi");
listaZak.add("weekend: kino, spacer z psem");
        listView.setAdapter(adapter);
        dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String text=editText.getText().toString();
               listaZak.add(text);

                listView.setAdapter(adapter);
            }
        });

    }
}