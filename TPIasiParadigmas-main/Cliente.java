package paquete;

public class Cliente extends Persona {
    // Atributos de la clase Cliente
    private Domicilio domicilio;
    private Vehiculo vehiculo;

    // Constructor por defecto de la clase Cliente
    public Cliente() {

    }

    //Constructor
    public Cliente(Domicilio domicilio, Vehiculo vehiculo) {
        this.domicilio = domicilio;
        this.vehiculo = vehiculo;
    }

    // Getters y Setters

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    // Metodos
    //conocer domicilio
    @Override
    public Domicilio getDomicilio() {
        return super.getDomicilio();
    }
    //validar cliente
        public boolean validarCliente () {
            return domicilio != null && vehiculo != null;
        }
    }

