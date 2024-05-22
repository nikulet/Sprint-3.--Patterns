package tasca1n2.gestion;

import tasca1n2.contact.ContactoFactory;
import tasca1n2.direccion.Direccion;
import tasca1n2.numero_telefono.NumeroTelefono;

import java.util.ArrayList;
import java.util.List;

public class LibroDeContactos {
    private final List<Direccion> direccion = new ArrayList<>();
    private final List<NumeroTelefono> numeroTelefono = new ArrayList<>();

    // Agregar un nuevo contacto a la agenda
    public void addContacto(ContactoFactory factory, String calle, String publacion, String codigoPostal, String comunidad, String areaCode, String number) {
        direccion.add(factory.crearDireccion(calle, publacion, codigoPostal, comunidad));
        numeroTelefono.add(factory.crearNumeroTelefono(areaCode, number));
    }

    public void mostrarContacts() {
        System.out.println("Contactos: ");
        for (int i = 0; i < direccion.size(); i++) {
            System.out.println((i + 1) + ") Direccion: " + direccion.get(i).getDireccionCompleta() + ", Numero de Telefono: " + numeroTelefono.get(i).getNumeroTelefono());
        }
    }

}