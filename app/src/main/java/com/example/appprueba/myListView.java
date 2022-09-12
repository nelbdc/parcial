package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class myListView extends AppCompatActivity {
    ListView Listas;
    ArrayAdapter Adapter_list;

    String[][] datos={
            {"Blanca como la nieve","Anne fontaine","Pelicula"},
            {"El gran Lebowski","Ethan Coen","Pelicula"},
            {"Una dulce venganza","andres rivers","Pelicula"},
            {"Casino Royale","pixlia","Pelicula"},
            {"Los hermanos caradura","Jhon Landis","Pelicula"},
            {"Mala Educación","Cory Finley","Pelicula"},
    };

    int[] datosImg={R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Listas =(ListView) findViewById(R.id.lvlist);
        Listas.setAdapter(new Adaptador(this,datos,datosImg));



    }
}