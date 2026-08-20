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
public class Justificacion {
        
    private String descripcion;
    private boolean valida;

    public Justificacion() {
        descripcion = "";
        valida = false;
    }

    public void registrarjustificacion() {
        descripcion = JOptionPane.showInputDialog(
                null, "ingrese la descripcion de la justificacion:"
        );

        if (descripcion.equalsIgnoreCase("justificacion medica")) {
            valida = true;
        } else {
            valida = false;
        }

        JOptionPane.showMessageDialog(
                null, "justificacion registrada correctamente."
        );
    }

    public String mostrarDatosJustificacion() {
        String informacion;
        informacion = "descripcion: " + descripcion
                + "\nvalida: " + valida;
        return informacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }
}
