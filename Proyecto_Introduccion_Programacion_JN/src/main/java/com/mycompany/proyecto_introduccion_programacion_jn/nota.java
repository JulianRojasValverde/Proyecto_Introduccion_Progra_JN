package proyecto;

import javax.swing.JOptionPane;

public class Nota {
    
    private String tipoevaluacion;
    private double calificacion;
    private double valorevaluacion;

    public Nota() {
        tipoevaluacion = "";
        calificacion = 0.0;
        valorevaluacion = 0.0;
    }

    public Nota(String tipoevaluacion, double calificacion, double valorevaluacion) {
        this.tipoevaluacion = tipoevaluacion;
        this.calificacion = calificacion;
        this.valorevaluacion = valorevaluacion;
    }

    public void registrarnota() {
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

    public String mostrardatos() {
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