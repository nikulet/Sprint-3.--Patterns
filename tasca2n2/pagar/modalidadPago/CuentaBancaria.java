package tasca2n2.pagar.modalidadPago;

import tasca2n2.pagar.MetodoPago;

public class CuentaBancaria implements MetodoPago {
    private String numeroCuentaBancarea;

    public CuentaBancaria(String numeroCuentaBancarea) {
        this.numeroCuentaBancarea = numeroCuentaBancarea;
    }

    @Override
    public void cantidadPagar(double cantidad) {
        System.out.println("Cantidad de dinero a pagar:" + cantidad + " €, pago con cuenta bancaria: " + numeroCuentaBancarea);
    }

}