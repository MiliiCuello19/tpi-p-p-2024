package paquete;

public class DetalleDefectoVisual {
    //Atributos
    private String descripcion;

    //Constructores
    public DetalleDefectoVisual(){

    }

    public DetalleDefectoVisual(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodos get y set
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
