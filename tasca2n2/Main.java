/*Simula una pasarela de pago que reciba un objeto encapsulador del método de pago a efectuar:
tarjeta de crédito, Paypal o deuda en cuenta bancaria.

La pasarela invocará el pago sin conocer la forma y devolviendo el control a la clase de origen.
La clase que invoca la pasarela de pago será una tienda de zapatos.*/
package tasca2n2;

import tasca2n2.pagar.MetodoPago;
import tasca2n2.pagar.modalidadPago.CuentaBancaria;
import tasca2n2.pagar.modalidadPago.Paypal;
import tasca2n2.pagar.modalidadPago.TarjetaCredito;
import tasca2n2.tienda.TiendaZapatos;

public class Main {
    public static void main(String[] args) {
        // Creado instancia de la tienda
        TiendaZapatos tienda = new TiendaZapatos();

        // Definir métodos de pago
        MetodoPago tarjeta = new TarjetaCredito("6731-0418-7731-9952", "753", "10/33");
        MetodoPago paypal = new Paypal("pagocantidad@paypal.com");
        MetodoPago cuentaBancaria = new CuentaBancaria("ES74815355905924364153");

        // Realizar compras con diferentes métodos de pago
        tienda.realizarCompra(tarjeta, 342.8);
        tienda.realizarCompra(paypal, 165.9);
        tienda.realizarCompra(cuentaBancaria, 990.0);

    }
}