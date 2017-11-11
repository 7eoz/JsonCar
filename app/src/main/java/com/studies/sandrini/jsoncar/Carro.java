package com.studies.sandrini.jsoncar;

/**
 * Created by Sandrini on 11/11/2017.
 */

public class Carro {
    private int id;
    private String modelo;
    private String placa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        return "[Id: " + id + ", modelo: " + modelo + ", placa: " + placa + "]";
    }

}
