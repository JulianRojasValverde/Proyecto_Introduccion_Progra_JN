package com.mycompany.proyecto_introduccion_programacion_jn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Brian
 */
public class Promedio {
    
    private double sumaNotas;
    private double promedioFinal;

    public Promedio() {
        sumaNotas = 0;
        promedioFinal = 0;
    }

    public double calcularPromedio(
            double notas[],
            int cantidadNotas) {

        sumaNotas = 0;

        for (int i = 0; i < cantidadNotas; i++) {
            sumaNotas = sumaNotas + notas[i];
        }

        if (cantidadNotas > 0) {
            promedioFinal = sumaNotas / cantidadNotas;
        } else {
            promedioFinal = 0;
        }

        return promedioFinal;
    }

    public double getSumaNotas() {
        return sumaNotas;
    }

    public void setSumaNotas(double sumaNotas) {
        this.sumaNotas = sumaNotas;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
}
