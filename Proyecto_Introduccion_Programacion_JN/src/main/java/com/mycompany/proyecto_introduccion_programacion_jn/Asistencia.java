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

public class Asistencia {
    
    private String fecha;
    private String estado;
    private boolean injustificada;

    public Asistencia() {
        fecha = "";
        estado = "";
        injustificada = false;
    }

    public void registrarAsistencia() {
        fecha = JOptionPane.showInputDialog(
                null, "ingrese la fecha de la clase:"
        );

        estado = JOptionPane.showInputDialog(
                null, "ingrese el estado de la asistencia (presente/ausente):"
        );

        if (estado.equalsIgnoreCase("ausente")) {
 
            String respuestastring;
            respuestastring = JOptionPane.showInputDialog(
                null, "la ausencia es injustificada? (si o no):"
            );
 
            if (respuestastring.equalsIgnoreCase("si")) {
                injustificada = true;
            } else {
                injustificada = false;
            }
 
        } else {
            injustificada = false;
        }

        JOptionPane.showMessageDialog(
                null, "asistencia registrada correctamente."
        );
    }

    public String mostrarDatosAsistencia() {
        String informacion;
        informacion = "fecha: " + fecha
                + "\nestado: " + estado
                + "\ninjustificada: " + injustificada;
        return informacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isInjustificada() {
        return injustificada;
    }

    public void setInjustificada(boolean injustificada) {
        this.injustificada = injustificada;
    }
}

