package paquete;

import java.util.Date;

public class Vehiculo {
    // Atirubutos
    private String marca;
    private String modelo;
    private String numeroChasis;
    private String patente;
    private Date anioFabricacion;
    private Cliente cliente;

    //Constructores
    public Vehiculo() {

    }

    ;

    public Vehiculo(String marca, String modelo, String numeroChasis, String patente, Date anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroChasis = numeroChasis;
        this.patente = patente;
        this.anioFabricacion = anioFabricacion;
    }

    //Metodos get y set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    //Metodos
    //conocer cliente
    public Cliente getCliente() {
        return cliente;
    }
    //validar vehiculo
    public boolean validarVehiculo() {
        return !modelo.isEmpty() && cliente != null;
    }
}

