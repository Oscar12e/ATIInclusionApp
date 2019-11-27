package com.example.atiinclusionapp.Model;

public class Inclusion {

    private boolean planB;
    private Grupo grupo;
    private Estudiante estudiante;
    private String comentario;
    private String correo="";

    public Inclusion(Grupo grupo, boolean planB, String comentario){
        this.grupo = grupo;
        this.planB = planB;
        this.comentario = comentario;
    }

    public Inclusion(boolean planB, Grupo grupo, String detalle, String correo) {
        this.planB = planB;
        this.grupo = grupo;
        this.correo=correo;
    }

    public boolean isPlanB() {
        return planB;
    }

    public void setPlanB(boolean planB) {
        this.planB = planB;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getCorreo() {
        return correo;
    }

}

