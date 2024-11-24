package paquete;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una tarifa con descripción, precio y fecha
        Tarifa tarifa = new Tarifa("Inspección básica", 500.0f, new Date());

        // Crear un objeto Cobro con fecha, monto, revisión y empleado
        Cobro cobro = new Cobro();
        cobro.setFecha(new Date());
        cobro.setTarifa(tarifa); // Asignar la tarifa al cobro

        // Intentar realizar un cobro con el monto exacto
        cobro.realizarCobro(500.0);  // Debería mostrar "Cobro realizado con éxito."

        // Intentar realizar un cobro con un monto incorrecto
        cobro.realizarCobro(400.0);  // Debería mostrar "Monto incorrecto. Por favor, ingrese el monto exacto."
    }
}
