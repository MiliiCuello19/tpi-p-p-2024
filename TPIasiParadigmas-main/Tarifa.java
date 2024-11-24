package paquete;

import java.util.Date;

public class Tarifa {
    // Atributos de la clase Tarifa
    private String descripcion;
    private float precio;
    private Date fecha;

    //Constructores
    public Tarifa() {
        // Constructor vacío por defecto
    }

    public Tarifa(String descripcion, float precio, Date fecha) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    //Metodos
    //Definir tarifa
    public void definirTarifa(String descripcion, float precio, Date fecha) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        System.out.println("Tarifa definida con éxito: " + descripcion);
    }
    //actualizar tarifa
    public void actualizarTarifa(String descripcion, float precio, Date fecha) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        System.out.println("Tarifa actualizada con éxito: " + descripcion);
    }
}
