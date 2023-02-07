package com.capgemini.practica.Controlller;

import com.capgemini.practica.Controlller.Tabla;
public class Result {
    public int ganancia;
    public int monto;
    public Tabla[] tabla;


    public Result(int ganancia, int monto, Tabla[] tabla) {
        this.ganancia = ganancia;
        this.monto = monto;
        this.tabla = tabla;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Tabla[] getTabla() {
        return tabla;
    }

    public void setTabla(Tabla[] tabla) {
        this.tabla = tabla;
    }
}