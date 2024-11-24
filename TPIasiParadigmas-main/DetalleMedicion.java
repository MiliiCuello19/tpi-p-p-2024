package paquete;

public class DetalleMedicion {
    // Atributos de la clase DetalleMedicion
    private String descripcion;
    private String resultado;

    public DetalleMedicion(String descripcion, String resultado) {
      this.descripcion = descripcion;
      this.resultado = resultado;
    }
   //Getters y Setters
    //Metodos tomar y mostrar

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
