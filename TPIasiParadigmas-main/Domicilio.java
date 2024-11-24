package paquete;

public class Domicilio {
    private String calle;
    private String ciudad;
    private String numeroDpto;
    private String codigoPostal;

    // Constructor vacío
    public Domicilio() {}

    // Constructor con parámetros
    public Domicilio(String calle, String ciudad, String numeroDpto, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.numeroDpto = numeroDpto;
        this.codigoPostal = codigoPostal;
    }

    // Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumeroDpto() {
        return numeroDpto;
    }

    public void setNumeroDpto(String numeroDpto) {
        this.numeroDpto = numeroDpto;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
