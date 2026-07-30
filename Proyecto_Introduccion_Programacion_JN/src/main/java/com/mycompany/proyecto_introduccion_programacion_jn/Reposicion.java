/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_introduccion_programacion_jn;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian Rojas
 */
public class Reposicion {
    
    private double promedioFinal;
    private int cantidadAusenciasInjustificadas;
    private boolean derechoReposicion;
    
    public Reposicion() {
        promedioFinal = 0;
        cantidadAusenciasInjustificadas = 0;
        derechoReposicion = false;
    }
    
    public Reposicion(double promedioFinal, int cantidadAusenciaInjustificadas) {
        this.promedioFinal = promedioFinal;
        this.cantidadAusenciasInjustificadas = cantidadAusenciaInjustificadas;
        this.derechoReposicion = false;
    }
    
    public boolean verificarReposicion(double promedioFinal, int cantidadAusenciaInjustificadas) {
         this.promedioFinal = promedioFinal;
        this.cantidadAusenciasInjustificadas = cantidadAusenciasInjustificadas;
 
        if (promedioFinal >= 65 && promedioFinal <= 69 && cantidadAusenciasInjustificadas <= 3) {
            derechoReposicion = true;
        } else {
            derechoReposicion = false;
        }
 
        if (derechoReposicion) {
            JOptionPane.showMessageDialog(
                null,
                "El estudiante si tiene derecho a reposición.\n"
                    + "Promedio final: " + promedioFinal
                    + "\nAusencias injustificadas: " + cantidadAusenciasInjustificadas);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "El estudiante no tiene derecho a reposición.\n"
                    + "Promedio final: " + promedioFinal
                    + "\nAusencias injustificadas: " + cantidadAusenciasInjustificadas);
        }
 
        return derechoReposicion;
    }
    
      public String mostrarDatos() {
 
        String informacion;
 
        informacion = "Promedio final: " + promedioFinal
            + "\nAusencias injustificadas: " + cantidadAusenciasInjustificadas
            + "\nDerecho a reposición: " + (derechoReposicion ? "Sí" : "No");
 
        return informacion;
    }
 
    public double getPromedioFinal() {
        return promedioFinal;
    }
 
    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
 
    public int getCantidadAusenciasInjustificadas() {
        return cantidadAusenciasInjustificadas;
    }
 
    public void setCantidadAusenciasInjustificadas(int cantidadAusenciasInjustificadas) {
        this.cantidadAusenciasInjustificadas = cantidadAusenciasInjustificadas;
    }
 
    public boolean isDerechoReposicion() {
        return derechoReposicion;
    }
 
    public void setDerechoReposicion(boolean derechoReposicion) {
        this.derechoReposicion = derechoReposicion;
    }
}
