package paquete;

import java.util.Date;

public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private String apellido;
    private int DNI;
    private Date fecha_nacimiento;
    private String mail;
;

    //Constructores
    public Persona() {
        // Constructor vacío por defecto
    }

    public Persona(String nombre, String apellido, int DNI, Date fecha_nacimiento, String mail, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fecha_nacimiento = fecha_nacimiento;
        this.mail = mail;

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Date getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public void setFechaNacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}

