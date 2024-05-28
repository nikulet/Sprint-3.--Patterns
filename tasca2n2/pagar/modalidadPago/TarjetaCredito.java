package tasca2n2.pagar.modalidadPago;

import tasca2n2.pagar.MetodoPago;

public class TarjetaCredito implements MetodoPago {
    private String numeroTarjeta;
    private String codigoSecretoTarjeta;
    private String fechaExpiracionTarjeta;

    public TarjetaCredito(String numeroTarjeta, String codigoSecretoTarjeta, String fechaExpiracionTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSecretoTarjeta = codigoSecretoTarjeta;
        this.fechaExpiracionTarjeta = fechaExpiracionTarjeta;
    }

    @Override
    public void cantidadPagar(double cantidad) {
        System.out.println("Cantidad de dinero a pagar: " + cantidad + " €, pago con tarjeta de crédito: " + numeroTarjeta);
    }

}