package paquete;

import java.util.Date;

public class Empleado extends Persona {
    // Atributos de la clase Empleado
    private int idEmpleado;
    private Rol rol;


    public Empleado() {
        // Constructor vacío por defecto
    }

    public Empleado(String nombre, String apellido, int DNI, Date fecha_nacimiento, String mail, String domicilio, int idEmpleado, Rol rol) {
        super(nombre, apellido, DNI, fecha_nacimiento, mail, domicilio);
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

