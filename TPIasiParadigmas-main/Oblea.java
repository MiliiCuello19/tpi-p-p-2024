package paquete;

import java.util.Date;

public class Oblea {
    // Atributos de la clase Oblea
    private int idOblea;
    private Date fechaMedicion;
    private String estado;
    private Revision revison;
    private Vehiculo vehiculo;

    //Constructores
    public Oblea(){

    }
    public Oblea(int idOblea, Date fechaMedicion,String estado) {
        this.idOblea = idOblea;
        this.fechaMedicion = fechaMedicion;
        this.estado = estado;
    }
    //Metodos get y set
    public int getIdOblea() {
        return idOblea;
    }

    public void setIdOblea(int idOblea) {
        this.idOblea = idOblea;
    }

    public Date getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(Date fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Revision getRevison() {
        return revison;
    }

    public void setRevison(Revision revison) {
        this.revison = revison;
    }
    //Metodos
    //conocer Vehiculo
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    //Actualizar stock
    public void actualizarStock(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado de la oblea actualizado a: " + nuevoEstado);
    }
    //Emitir oblea
    public void emitirOblea() {
        System.out.println("Emisión de oblea:");
        System.out.println("ID Oblea: " + idOblea);
        System.out.println("Fecha de Medición: " + fechaMedicion);
        System.out.println("Estado: " + estado);
        if (vehiculo != null) {
            System.out.println("Vehículo Asociado: " + vehiculo.getModelo());
        } else {
            System.out.println("Vehículo Asociado: No asignado");
        }
    }

}
