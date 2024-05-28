package tasca2n1.interfase;

public interface Publicador {
    public void agregarSuscriptor(Suscriptor suscriptor);
    public void eliminarSuscriptor(Suscriptor suscriptor);
    public void notificarSuscriptores(String texto);
}