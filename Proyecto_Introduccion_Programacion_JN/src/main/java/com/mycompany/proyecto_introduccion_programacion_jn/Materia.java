/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_introduccion_progra;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class Materia {

    private String nombreMateria;
    private String codigoMateria;
    private Estudiante estudiante;

    public Materia() {
        nombreMateria = "";
        codigoMateria = "";
        estudiante = null;
    }

    public Materia(
            String nombreMateria,
            String codigoMateria,
            Estudiante estudiante) {

        this.nombreMateria = nombreMateria;
        this.codigoMateria = codigoMateria;
        this.estudiante = estudiante;
    }

    public void registrarMateria(Estudiante estudianteSeleccionado) {

        estudiante = estudianteSeleccionado;

        nombreMateria = JOptionPane.showInputDialog(
                null,"Ingrese el nombre de la materia:"
        );

        codigoMateria = JOptionPane.showInputDialog(
                null,"Ingrese el código de la materia:"
        );

        JOptionPane.showMessageDialog(
                null,"Materia registrada correctamente para:\n"
                + estudiante.getNombre()
        );
    }

    public String mostrarDatos() {

        String informacion;

        informacion = "Nombre de la materia: " + nombreMateria
                + "\nCódigo de la materia: " + codigoMateria
                + "\nEstudiante: " + estudiante.getNombre()
                + "\nCédula: " + estudiante.getCedula();

        return informacion;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}