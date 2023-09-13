
package logica;

public class Transaccion {
    private String tipo;
    private double monto;
    private String fecha;

    public Transaccion(String tipo, double monto, String fecha) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String obtenerTipo() {
        return this.tipo;
    }

    public double obtenerMonto() {
        return this.monto;
    }

    public String obtenerFecha() {
        return this.fecha;
    }
}
