package paquete;

import java.util.Date;
import java.util.List;
public class Revision {
    // Atributos de la clase Revision
    private int idRevision;
    private String estado;
    private Date fechaAlta;
    private Date fechaRealizacion;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private Medicion medicion;
    private DefectoVisual defectoVisual;
    private String observacionesFinales;
    private Date fechaVencimiento;
    private String proximaRevision;
    private String motivoRechazo;

    //Cosntructores
    public Revision(){

    }
    public Revision(int idRevision,String estado,Date fechaAlta, Date fechaRealizacion,Empleado empleado, Vehiculo vehiculo,
                    Medicion medicion,DefectoVisual defectoVisual,
                    String observacionesFinales, Date fechaVencimiento,
                    String proximaRevision, String motivoRechazo) {
        this.idRevision = idRevision;
        this.estado = estado;
        this.fechaAlta = fechaAlta;
        this.fechaRealizacion = fechaRealizacion;
        this.empleado=empleado;
        this.vehiculo = vehiculo;
        this.medicion = medicion;
        this.defectoVisual = defectoVisual;
        this.observacionesFinales = observacionesFinales;
        this.fechaVencimiento = fechaVencimiento;
        this.proximaRevision = proximaRevision;
        this.motivoRechazo = motivoRechazo;
    }

    // Getters y Setters
    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }
    //Conocer empleado
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    //Conocer Vehiculo
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    //Conocer medicion
    public Medicion getMedicion() {
        return medicion;
    }

    public void setMedicion(Medicion medicion) {
        this.medicion = medicion;
    }
    //conocer defecto visual
    public DefectoVisual getDefectoVisual() {
        return defectoVisual;
    }

    public void setDefectoVisual(DefectoVisual defectoVisual) {
        this.defectoVisual = defectoVisual;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacionesFinales() {
        return observacionesFinales;
    }

    public void setObservacionesFinales(String observacionesFinales) {
        this.observacionesFinales = observacionesFinales;
    }

    public String getProximaRevision() {
        return proximaRevision;
    }

    public void setProximaRevision(String proximaRevision) {
        this.proximaRevision = proximaRevision;
    }

    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }
    //Metodos
    //Generar comprobante de revision
    public String generarComprobante() {
        return "Comprobante de Revisión\n" +
                "ID Revisión: " + idRevision + "\n" +
                "Estado: " + estado + "\n" +
                "Fecha de Realización: " + (fechaRealizacion != null ? fechaRealizacion : "No realizada") + "\n" +
                "Vehículo: " + (vehiculo != null ? vehiculo.getModelo() : "No asignado") + "\n" +
                "Empleado Responsable: " + (empleado != null ? empleado.getNombre() : "No asignado") + "\n" +
                "Observaciones Finales: " + (observacionesFinales != null ? observacionesFinales : "Sin observaciones");
    }
    //emitir comprobante de revision
    public void emitirComprobante() {
        System.out.println(generarComprobante());
    }
    //emitir informe
    public void emitirInforme() {
        System.out.println("Informe Detallado de Revisión");
        System.out.println("ID Revisión: " + idRevision);
        System.out.println("Estado: " + estado);
        System.out.println("Fecha de Realización: " + (fechaRealizacion != null ? fechaRealizacion : "No realizada"));
        System.out.println("Vehículo: " + (vehiculo != null ? vehiculo.getModelo() : "No asignado"));
        System.out.println("Defecto Visual: " + (defectoVisual != null ? defectoVisual.getObservacion() : "Ninguno"));
        System.out.println("Motivo de Rechazo: " + (motivoRechazo != null ? motivoRechazo : "Ninguno"));
        System.out.println("Fecha de Vencimiento: " + (fechaVencimiento != null ? fechaVencimiento : "No asignada"));
        System.out.println("Próxima Revisión: " + (proximaRevision != null ? proximaRevision : "No definida"));
        System.out.println("Observaciones Finales: " + (observacionesFinales != null ? observacionesFinales : "Sin observaciones"));
    }
}
