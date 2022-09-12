package com.example.appprueba;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
        private static LayoutInflater inflater =null;

        Context contexto;
        String[][] datos;
        int[] datosimg;

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
                @SuppressLint("ViewHolder") final View vista = inflater.inflate(R.layout.elemento_lista, null);
                TextView titulo = (TextView) vista.findViewById(R.id.lvtitulo);
                TextView tipo = (TextView) vista.findViewById(R.id.lvtipo);
                TextView director = (TextView) vista.findViewById(R.id. lvautor) ;
                ImageView imagen = (ImageView) vista.findViewById(R.id.lvimageView);
                Button play = (Button) vista.findViewById(R.id.lvrun);
                titulo.setText (datos [i] [0]);
                director.setText (datos[i][1]);
                tipo.setText ( datos [i][2]);
                imagen.setImageResource (datosimg[i]);
                play.setText ("ver");
        /*
        imagen.setTag (1) ;
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent (contexto, VisorImagen.class);
                visorImagen.putExtra("IMG", datos Ing[(Integer) v.getTag()]);
                contexto.startActivity (visorImagen);
            }
        };
         */
                return vista;
        }
        public Adaptador (Context contexto, String[][] datos, int[] imagenes)
        {
                this.contexto=contexto;
                this.datos=datos;
                this.datosimg=imagenes;
                inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);


        }

        @Override
        public int getCount() {
                return datosimg.length;
        }

        @Override
        public Object getItem(int i) {
                return null;
        }

        @Override
        public long getItemId(int i) {
                return 0;
        }


}
