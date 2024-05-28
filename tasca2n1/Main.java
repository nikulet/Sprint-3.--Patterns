package tasca2n1;

import tasca2n1.bursa.MercadoDeBolsa;
import tasca2n1.interfase.Suscriptor;

public class Main {
    public static void main(String[] args) {

        MercadoDeBolsa mercadoDeBolsa = new MercadoDeBolsa();

        Suscriptor suscriptor1 = texto -> System.out.println("Reuters Glob: " + texto);

        Suscriptor suscriptor2 = texto -> System.out.println("Cronista BURS : " + texto);

        mercadoDeBolsa.agregarSuscriptor(suscriptor1);
        mercadoDeBolsa.agregarSuscriptor(suscriptor2);

        mercadoDeBolsa.setEstadoDelMercado("El mercado está en alza");

        mercadoDeBolsa.eliminarSuscriptor(suscriptor2);  // elimina suscriptor de bursa
        mercadoDeBolsa.setEstadoDelMercado("El mercado está en baja");

    }
}