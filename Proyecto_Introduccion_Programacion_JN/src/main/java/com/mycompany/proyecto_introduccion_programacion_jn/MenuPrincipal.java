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
   private Asistencia asistencias[] = new Asistencia[100];
   private Nota notas[] = new Nota[100];
   private Justificacion justificaciones[] = new Justificacion[100];
 
   private int cantidadEstudiantes = 0;
   private int cantidadMaterias = 0;
   private int cantidadAsistencias = 0;
   private int cantidadNotas = 0;
   private int cantidadJustificaciones = 0;
   
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
                   
                    break;

                case 9:
                    
                    break;

                case 10:
                      JOptionPane.showMessageDialog(
            null,
            "Gracias por utilizar el sistema."
    );
                    break;

                default:
                    
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
    public void calcularPromedio() {

        JOptionPane.showMessageDialog(null,"Aqui intenten cuadrar las cosas que use revisen el Promedio.java");
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
public static void verificarEstadoEstudiante() {

    double promedioFinal;
    int ausenciasInjustificadas;
    String estadoAcademico;

    promedioFinal = Double.parseDouble(
            JOptionPane.showInputDialog(
                    null,
                    "Ingrese el promedio final:"
            )
    );

    ausenciasInjustificadas = Integer.parseInt(
            JOptionPane.showInputDialog(
                    null,
                    "Ingrese las ausencias injustificadas:"
            )
    );

    if (ausenciasInjustificadas > 3) {

        estadoAcademico = "REPROBADO POR AUSENCIAS";

    } else if (promedioFinal >= 70) {

        estadoAcademico = "APROBADO";

    } else {

        estadoAcademico = "REPROBADO";
    }

    JOptionPane.showMessageDialog(
            null,
            "Promedio final: " + promedioFinal
            + "\nAusencias injustificadas: "
            + ausenciasInjustificadas
            + "\nEstado académico: "
            + estadoAcademico
    );
}

    public void registrarAsistencia() {

    if (cantidadAsistencias < asistencias.length) {

        asistencias[cantidadAsistencias] = new Asistencia();

        asistencias[cantidadAsistencias].registrarAsistencia();

        cantidadAsistencias++;

    } else {

        JOptionPane.showMessageDialog(null,"No se pueden registrar más asistencias.");
        }
    }
    public void registrarNota() {

    if (cantidadNotas < notas.length) {

        notas[cantidadNotas] = new Nota();

        notas[cantidadNotas].registrarnota();

        cantidadNotas++;

    } else {

        JOptionPane.showMessageDialog(null,"No se pueden registrar más notas.");
        }
    }
    public void registrarJustificacion() {

    if (cantidadJustificaciones < justificaciones.length) {

        justificaciones[cantidadJustificaciones] = new Justificacion();

        justificaciones[cantidadJustificaciones].registrarjustificacion();

        cantidadJustificaciones++;

    } else {

        JOptionPane.showMessageDialog(null,"No se pueden registrar más justificaciones.");
        }
    }
}
