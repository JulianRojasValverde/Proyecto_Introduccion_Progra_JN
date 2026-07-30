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
public class Reporte {
    private Estudiante estudiante;
    private double promedioFinal;
    private int cantidadFaltas;
    private String estadoAcademico;
 
    public Reporte() {
        estudiante = null;
        promedioFinal = 0;
        cantidadFaltas = 0;
        estadoAcademico = "";
    }
 
    public Reporte(Estudiante estudiante, double promedioFinal, int cantidadFaltas) {
        this.estudiante = estudiante;
        this.promedioFinal = promedioFinal;
        this.cantidadFaltas = cantidadFaltas;
        this.estadoAcademico = "";
    }

    public void generarReporte(Estudiante estudiante, Materia materia, double promedioFinal, int cantidadFaltas) {
 
        this.estudiante = estudiante;
        this.promedioFinal = promedioFinal;
        this.cantidadFaltas = cantidadFaltas;
 
        if (promedioFinal >= 70 && cantidadFaltas <= 3) {
            estadoAcademico = "Aprobado";
        } else if (cantidadFaltas > 3) {
            estadoAcademico = "Reprobado por exceso de ausencias injustificadas";
        } else {
            Reposicion reposicion = new Reposicion();
            boolean tieneDerecho = false;
 
            if (promedioFinal >= 65 && promedioFinal <= 69 && cantidadFaltas <= 3) {
                tieneDerecho = true;
            }
 
            if (tieneDerecho) {
                estadoAcademico = "Reprobado - Tiene derecho a reposición";
            } else {
                estadoAcademico = "Reprobado";
            }
        }
 
        String informacion;
 
        informacion = "REPORTE ACADÉMICO"
            + estudiante.mostrarDatos()
            + "\n\nMateria: " + materia.getNombreMateria()
            + "\nCódigo: " + materia.getCodigoMateria()
            + "\n\nPromedio final: " + promedioFinal
            + "\nCantidad de faltas: " + cantidadFaltas
            + "\nEstado académico: " + estadoAcademico;
 
        JOptionPane.showMessageDialog(null, informacion);
    }
 
    public String mostrarDatos() {
 
        String informacion;
 
        informacion = "Estudiante: " + (estudiante != null ? estudiante.getNombre() : "N/A")
            + "\nPromedio final: " + promedioFinal
            + "\nCantidad de faltas: " + cantidadFaltas
            + "\nEstado académico: " + estadoAcademico;
 
        return informacion;
    }
 
    public Estudiante getEstudiante() {
        return estudiante;
    }
 
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
 
    public double getPromedioFinal() {
        return promedioFinal;
    }
 
    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
 
    public int getCantidadFaltas() {
        return cantidadFaltas;
    }
 
    public void setCantidadFaltas(int cantidadFaltas) {
        this.cantidadFaltas = cantidadFaltas;
    }
 
    public String getEstadoAcademico() {
        return estadoAcademico;
    }
 
    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }
}
