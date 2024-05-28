package tasca2n2.pagar;

public class PasarelaPago {

    // Implementado la clase Pasarela de Pagos para procesar el pago con el meetodo de pago
    //  correspondiente y la cantidad correspondiente al meetodo de pago segun el caso.
    public void procesarPago(MetodoPago metodoPago, double cantidad) {
        metodoPago.cantidadPagar(cantidad);
    }

}