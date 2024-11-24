package paquete;

import java.util.Date;

public class Empleado extends Persona {
    private int idEmpleado;
    private Rol rol;

    // Constructor vacío
    public Empleado() {}

    // Constructor con parámetros
    public Empleado(String nombre, String apellido, int DNI, Date fechaNacimiento, String mail, Domicilio domicilio, int idEmpleado, Rol rol) {
        super(nombre, apellido, DNI, fechaNacimiento, mail, domicilio);
        this.idEmpleado = idEmpleado;
        this.rol = rol;
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
