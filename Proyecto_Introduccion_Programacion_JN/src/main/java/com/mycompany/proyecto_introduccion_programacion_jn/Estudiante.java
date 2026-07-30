/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_introduccion_programacion_jn;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class Estudiante {
    
    private int cedula;
    private String nombre;
    private String correo;

    public Estudiante() {
        cedula = 0;
        nombre = "";
        correo = "";
    }

    public Estudiante(int cedula, String nombre, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void registrarEstudiante() {

        String cedulaString;

        cedulaString = JOptionPane.showInputDialog(
                null,"Ingrese la cédula del estudiante:"
        );

        cedula = Integer.parseInt(cedulaString);

        nombre = JOptionPane.showInputDialog(
                null,"Ingrese el nombre del estudiante:"
        );

        correo = JOptionPane.showInputDialog(
                null,"Ingrese el correo del estudiante:"
        );

        JOptionPane.showMessageDialog(
                null,"Estudiante registrado correctamente."
        );
    }

    public String mostrarDatos() {

        String informacion;

        informacion = "Cédula: " + cedula
                + "\nNombre: " + nombre
                + "\nCorreo: " + correo;

        return informacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
