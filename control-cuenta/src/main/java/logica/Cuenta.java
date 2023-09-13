
package logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cuenta {
    private double saldoTotal;
    private double saldoBancario;
    private double saldoEfectivo;
    private Registro registro;
    
    public Cuenta(){
        saldoTotal = 0.0;
        saldoBancario = 0.0;
        saldoEfectivo = 0.0;
        registro = new Registro();
    }
    
    public void depositarEfectivo(double cantidad){
        saldoEfectivo += cantidad;
        saldoTotal += cantidad;
    }
    
    public void depositarBancario(double cantidad){
        saldoBancario += cantidad;
        saldoTotal += cantidad;
        registro.agregarTransaccion(new Transaccion("Deposito en efectivo", cantidad, obtenerFechaActual()));
    }
    
    public void cargarGastoEfectivo(double cantidad){
        if (saldoEfectivo >= cantidad) {
            saldoEfectivo -= cantidad;
            saldoTotal -= cantidad;
            registro.agregarTransaccion(new Transaccion("Gasto en Efectivo", cantidad, obtenerFechaActual()));
        } else {
            System.out.println("Saldo insuficiente en efectivo.");
        }
    }
    
    public void cargarGastoBancario(double cantidad){
        if (saldoBancario >= cantidad) {
            saldoBancario -= cantidad;
            saldoTotal -= cantidad;
            registro.agregarTransaccion(new Transaccion("Gasto Bancario", cantidad, obtenerFechaActual()));
        } else {
            System.out.println("Saldo insuficiente en la cuenta bancaria.");
        }
    }
    
    private String obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formatter);
    }
    
}
