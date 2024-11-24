package paquete;

import java.util.List;

public class Medicion {
    // Atributos de la clase Medicion
    private String nombre;
    private String resultado;
    private String seccion;
    private String maquina;
    private List<DetalleMedicion> detalles;

   //Constructores
    public Medicion(String nombre, String resultado,String seccion,String maquina,List<DetalleMedicion> detalles) {
        this.nombre = nombre;
        this.resultado = resultado;
        this.seccion = seccion;
        this.maquina = maquina;
        this.detalles = detalles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public List<DetalleMedicion> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleMedicion> detalles) {
        this.detalles = detalles;
    }
}
