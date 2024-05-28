package tasca2n1.bursa;

import tasca2n1.interfase.Publicador;
import tasca2n1.interfase.Suscriptor;

import java.util.ArrayList;
import java.util.List;

public class MercadoDeBolsa implements Publicador {
    private List<Suscriptor> suscriptores = new ArrayList<>();
    private String estadoDelMercado;

    public void setEstadoDelMercado(String estado) {
        this.estadoDelMercado = estado;
        notificarSuscriptores(estadoDelMercado);
    }

    @Override
    public void agregarSuscriptor(Suscriptor suscriptor) {
        suscriptores.add(suscriptor);
    }

    @Override
    public void eliminarSuscriptor(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
    }

    @Override
    public void notificarSuscriptores(String texto) {
        suscriptores.forEach(suscriptor -> suscriptor.mostrarNotificaciones(texto));
    }
}