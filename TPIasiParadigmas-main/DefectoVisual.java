package paquete;

import java.util.List;

public class DefectoVisual {
    // Atributo que describe el defecto visual
    private String observacion;
    private String calificacion;
    private List<DetalleDefectoVisual> detalles;
    private Empleado empleado;

    //Constructores
    public DefectoVisual(){

    }
    public DefectoVisual(String observacion,String calificacion,List<DetalleDefectoVisual> detalles) {
        this.observacion = observacion;
        this.calificacion = calificacion;
        this.detalles = detalles;
    }


    // Métodos Getters y Setters
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public List<DetalleDefectoVisual> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleDefectoVisual> detalles) {
        this.detalles = detalles;
    }
    //Metodos
    //conocer empleado
    public Empleado getEmpleado() {
        return empleado;
    }

}
