package com.example.atiinclusionapp.Model;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {

    private int carnet;
    private String nombre="";
    private String email="";
    private int phone=0;


    public Estudiante(int carnet, String nombre, String email, int phone,String plan) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
    }

    public Estudiante(int carnet, String nombre,String plan) {
        this.carnet = carnet;
        this.nombre = nombre;
    }

    public Estudiante(int carnet,String plan) {
        this.carnet = carnet;
    }

    public int getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}

