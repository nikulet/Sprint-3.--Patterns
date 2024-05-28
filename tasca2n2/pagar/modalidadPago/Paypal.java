package tasca2n2.pagar.modalidadPago;

import tasca2n2.pagar.MetodoPago;

public class Paypal implements MetodoPago {
    private String correoElectronico;

    public Paypal(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void cantidadPagar(double cantidad) {
        System.out.println("Cantidad de dinero a pagar: " + cantidad + " €, pago con PayPal: " + correoElectronico);
    }

}