package tasca2n2.tienda;

import tasca2n2.pagar.MetodoPago;
import tasca2n2.pagar.PasarelaPago;

public class TiendaZapatos {
    private PasarelaPago pasarelaPago;

    public TiendaZapatos() {
        this.pasarelaPago = new PasarelaPago();
    }

    public void realizarCompra(MetodoPago metodoPago, double cantidad) {
        pasarelaPago.procesarPago(metodoPago, cantidad);
    }

}