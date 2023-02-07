package com.capgemini.practica.Controlller;

public class Tabla{
    public int año;
    public int saldoInicial;
    public int aportacion;
    public int rendimiento;
    public int saldoFinal;

    public Tabla() {

    }
    public Tabla(int año, int saldoInicial, int aportacion, int rendimiento, int saldoFinal) {
        this.año = año;
        this.saldoInicial = saldoInicial;
        this.aportacion = aportacion;
        this.rendimiento = rendimiento;
        this.saldoFinal = saldoFinal;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public int getAportacion() {
        return aportacion;
    }

    public void setAportacion(int aportacion) {
        this.aportacion = aportacion;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public int getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(int saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tabla{" +
                "año=" + año +
                ", saldoInicial=" + saldoInicial +
                ", aportacion=" + aportacion +
                ", rendimiento=" + rendimiento +
                ", saldoFinal=" + saldoFinal +
                '}';
    }
}