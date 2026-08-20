/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_introduccion_programacion_jn;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class MenuPrincipal{

   private Estudiante estudiantes[] = new Estudiante[100];
   private Materia materias[] = new Materia[100];
 
   private int cantidadEstudiantes = 0;
   private int cantidadMaterias = 0;
   
   public void mostrarMenu() {
       int opcion;
       do {
           opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"SISTEMA DE NOTAS ESTUDIANTIL\n\n"
                + "1. Registrar estudiante\n"
                + "2. Registrar materia\n"
                + "3. Registrar notas\n"
                + "4. Registrar asistencia\n"
                + "5. Registrar justificación\n"
                + "6. Calcular promedio\n"
                + "7. Verificar estado del estudiante\n"
                + "8. Verificar derecho a reposición\n"
                + "9. Generar reporte\n"
                + "10. Salir\n\n"
                + "Seleccione una opción:")
            );

            switch (opcion) {

                case 1:
                    registrarEstudiante();
                    break;

                case 2:
                    registrarMateria();
                    break;

                case 3:
                    registrarNota();
                    break;

                case 4:
                    registrarAsistencia();
                    break;

                case 5:
                    registrarJustificacion();
                    break;

                case 6:
                    calcularPromedio();
                    break;

                case 7:
                    verificarEstadoEstudiante();
                    break;
                    
                case 8:
                   verificarDerechoReposicion();
                    break;

                case 9:
                    generarReporte();
                    break;
            }

        } while (opcion != 10);
    }

    public void registrarEstudiante() {

        if (cantidadEstudiantes < estudiantes.length) {
            
            estudiantes[cantidadEstudiantes] = new Estudiante();

            estudiantes[cantidadEstudiantes].registrarEstudiante();

            cantidadEstudiantes++;

        } else {

            JOptionPane.showMessageDialog(null,"No se pueden registrar más estudiantes.");
        }
    }

    public void registrarMateria() {

        if (cantidadEstudiantes == 0) {

            JOptionPane.showMessageDialog(null,"Primero debe registrar un estudiante.");

        } else if (cantidadMaterias < materias.length) {

        int cedulaBuscada;

        cedulaBuscada = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Ingrese la cédula del estudiante:")
        );

        Estudiante estudianteEncontrado;

        estudianteEncontrado = buscarEstudiante(
                cedulaBuscada
        );

        if (estudianteEncontrado != null) {

            materias[cantidadMaterias] = new Materia();

            materias[cantidadMaterias].registrarMateria(
                    estudianteEncontrado
            );

            cantidadMaterias++;

        } else {

            JOptionPane.showMessageDialog(null,"No existe un estudiante con esa cédula.");
        }

        } else {

            JOptionPane.showMessageDialog(null,"No se pueden registrar más materias.");
        }
    }
    
    public Estudiante buscarEstudiante(int cedulaBuscada) {

        Estudiante estudianteEncontrado = null;

        for (int i = 0; i < cantidadEstudiantes; i++) {

            if (estudiantes[i].getCedula() == cedulaBuscada) {
                estudianteEncontrado = estudiantes[i];
            }
        }

        return estudianteEncontrado;
    }
    
    public Materia obtenerUltimaMateria() {
 
        if (cantidadMaterias == 0) {
            JOptionPane.showMessageDialog(null,"Primero debe registrar una materia.");
            return null;
        }
 
        return materias[cantidadMaterias - 1];
    }
    
    public void registrarNota() {
        
    Materia materia = obtenerUltimaMateria();
 
        if (materia != null) {
            Nota nota = new Nota();
            nota.registrarNota();
            materia.agregarNota(nota);
        }
    }
    
    public void registrarAsistencia() {

        Materia materia = obtenerUltimaMateria();
 
        if (materia != null) {
            Asistencia asistencia = new Asistencia();
            asistencia.registrarAsistencia();
            materia.agregarAsistencia(asistencia);
        }
    }
    
    public void registrarJustificacion() {
        Justificacion justificacion = new Justificacion();
        justificacion.registrarjustificacion();
    }
    
    public void calcularPromedio() {
        Materia materia = obtenerUltimaMateria();
 
        if (materia != null) {
 
            Promedio promedio = new Promedio();
 
            double resultado = promedio.calcularPromedio(
                materia.obtenerCalificaciones(),
                materia.getCantidadNotas()
            );
 
            JOptionPane.showMessageDialog(null,
                "Promedio final de " + materia.getNombreMateria()
                + " para " + materia.getEstudiante().getNombre()
                + ": " + resultado
            );
        }
    }
    
       public void verificarEstadoEstudiante() {
 
        Materia materia = obtenerUltimaMateria();
 
        if (materia != null) {
 
            Promedio promedio = new Promedio();
            double promedioFinal = promedio.calcularPromedio(
                materia.obtenerCalificaciones(),
                materia.getCantidadNotas()
            );
 
            int ausenciasInjustificadas = materia.contarAusenciasInjustificadas();
 
            boolean aprobado = (promedioFinal >= 70) && (ausenciasInjustificadas <= 3);
 
            JOptionPane.showMessageDialog(null,
                "Estudiante: " + materia.getEstudiante().getNombre()
                + "\nMateria: " + materia.getNombreMateria()
                + "\nPromedio final: " + promedioFinal
                + "\nAusencias injustificadas: " + ausenciasInjustificadas
                + "\nEstado: " + (aprobado ? "Aprobado" : "Reprobado")
            );
        }
    }
       
   public void verificarDerechoReposicion() {
 
        Materia materia = obtenerUltimaMateria();
 
        if (materia != null) {
 
            Promedio promedio = new Promedio();
            double promedioFinal = promedio.calcularPromedio(
                materia.obtenerCalificaciones(),
                materia.getCantidadNotas()
            );
 
            int ausenciasInjustificadas = materia.contarAusenciasInjustificadas();
 
            Reposicion reposicion = new Reposicion();
            reposicion.verificarReposicion(promedioFinal, ausenciasInjustificadas);
        }
    }
   
    public void generarReporte() {
 
        Materia materia = obtenerUltimaMateria();
 
        if (materia != null) {
 
            Promedio promedio = new Promedio();
            double promedioFinal = promedio.calcularPromedio(
                materia.obtenerCalificaciones(),
                materia.getCantidadNotas()
            );
 
            int ausenciasInjustificadas = materia.contarAusenciasInjustificadas();
 
            Reporte reporte = new Reporte();
            reporte.generarReporte(
                materia.getEstudiante(),
                materia,
                promedioFinal,
                ausenciasInjustificadas
            );
        }
    }
   
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();

        menu.mostrarMenu();
    }
}
