package proyecto;

import javax.swing.JOptionPane;

public class Asistencia {
    
    private String fecha;
    private String estado;
    private boolean injustificada;

    public Asistencia() {
        fecha = "";
        estado = "";
        injustificada = false;
    }

    public Asistencia(String fecha, String estado, boolean injustificada) {
        this.fecha = fecha;
        this.estado = estado;
        this.injustificada = injustificada;
    }

    public void registrarasistencia() {
        fecha = JOptionPane.showInputDialog(
                null, "ingrese la fecha de la clase:"
        );

        estado = JOptionPane.showInputDialog(
                null, "ingrese el estado de la asistencia:"
        );

        String respuestastring;
        respuestastring = JOptionPane.showInputDialog(
                null, "la ausencia es injustificada? (si o no):"
        );

        if (respuestastring.equalsIgnoreCase("si")) {
            injustificada = true;
        } else {
            injustificada = false;
        }

        JOptionPane.showMessageDialog(
                null, "asistencia registrada correctamente."
        );
    }

    public String mostrardatos() {
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