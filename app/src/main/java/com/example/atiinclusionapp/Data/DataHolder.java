package com.example.atiinclusionapp.Data;

import android.widget.ListView;

import com.example.atiinclusionapp.Model.Curso;
import com.example.atiinclusionapp.Model.Grupo;

import java.util.ArrayList;
import java.util.List;

public class DataHolder {
    private static DataHolder instance = new DataHolder();
    private List<Grupo> oferta;

    private DataHolder(){}

    public void simulate(){
        Curso taller = new Curso("TI1401", "TALLER DE PROGRAMACION");
        Curso costos = new Curso("TI3103", "COSTOS EN AMBIENTES INFORMATICOS");
        Curso gestion = new Curso("TI5300", "COMPORTAMIENTO ORGANIZACIONAL Y GESTION DE CAMBIOS");

        this.oferta = new ArrayList<>();
        this.oferta.add( new Grupo(2, "Sonia Mora", gestion) );
        this.oferta.add( new Grupo(3, "Sonia Mora", gestion) );

        this.oferta.add( new Grupo(1, "Luis Pablo Soto", taller) );
        this.oferta.add( new Grupo(4, "Diego Mora", taller) );

        this.oferta.add( new Grupo(2, "Javier Chavarria", costos) );
    }


    public static DataHolder getInstance(){
        return instance;
    }

    public List<Grupo> getOferta(){
        return oferta;
    }
}
