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
public class Nota {
        
    private String tipoevaluacion;
    private double calificacion;
    private double valorevaluacion;

    public Nota() {
        tipoevaluacion = "";
        calificacion = 0.0;
        valorevaluacion = 0.0;
    }

    public void registrarNota() {
        tipoevaluacion = JOptionPane.showInputDialog(
                null, "ingrese el tipo de evaluacion:"
        );

        String calstring;
        calstring = JOptionPane.showInputDialog(
                null, "ingrese la calificacion obtenida:"
        );
        calificacion = Double.parseDouble(calstring);

        String valorstring;
        valorstring = JOptionPane.showInputDialog(
                null, "ingrese el valor de la evaluacion:"
        );
        valorevaluacion = Double.parseDouble(valorstring);

        JOptionPane.showMessageDialog(
                null, "nota registrada correctamente."
        );
    }

    public String mostrarDatosNota() {
        String informacion;
        informacion = "tipo de evaluacion: " + tipoevaluacion
                + "\ncalificacion: " + calificacion
                + "\nvalor: " + valorevaluacion;
        return informacion;
    }

    public String getTipoevaluacion() {
        return tipoevaluacion;
    }

    public void setTipoevaluacion(String tipoevaluacion) {
        this.tipoevaluacion = tipoevaluacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getValorevaluacion() {
        return valorevaluacion;
    }

    public void setValorevaluacion(double valorevaluacion) {
        this.valorevaluacion = valorevaluacion;
    }
}
