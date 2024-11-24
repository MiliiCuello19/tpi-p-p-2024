package paquete;

public class Cliente extends Persona {
    private Vehiculo vehiculo;

    // Constructor vacío
    public Cliente() {}

    // Constructor con parámetros
    public Cliente(String nombre, String apellido, int DNI, Domicilio domicilio, Vehiculo vehiculo) {
        super(nombre, apellido, DNI, null, null, domicilio);
        this.vehiculo = vehiculo;
    }

    // Getters y Setters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Método validar cliente
    public boolean validarCliente() {
        return getDomicilio() != null && vehiculo != null;
    }
}
