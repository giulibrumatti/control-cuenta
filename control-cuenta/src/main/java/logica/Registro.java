
package logica;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Transaccion> transacciones;

    public Registro() {
        transacciones = new ArrayList<>();
    }

    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    public List<Transaccion> listarTransacciones() {
        return transacciones;
    }
}
