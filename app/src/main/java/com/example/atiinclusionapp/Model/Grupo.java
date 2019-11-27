package com.example.atiinclusionapp.Model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private int numGrupo;
    private String profesor;
    private Curso curso;


    public int getNumGrupo() {
        return numGrupo;
    }

    public String getProfesor() {
        return profesor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNumGrupo(int numGrupo) {
        this.numGrupo = numGrupo;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


    public Grupo(int numGrupo, String profesor, Curso curso) {
        this.numGrupo = numGrupo;
        this.profesor = profesor;
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "Grupo{" +
                "numGrupo=" + numGrupo +
                ", profesor='" + profesor + '\'' +
                ", curso=" + curso +
                '}';
    }
}