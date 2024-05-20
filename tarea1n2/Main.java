package tarea1n2;

import tarea1n2.contact.contactoFactory;
import tarea1n2.contact.ContactoFactoryUK;
import tarea1n2.contact.ContactoFactoryUSA;
import tarea1n2.contact.ContactoFactoryMoldavia;
import tarea1n2.gestion.LibroDeContactos;

public class Main {
    public static void main(String[] args) {
        LibroDeContactos libroDeContactos = new LibroDeContactos();

        contactoFactory usFactory = new ContactoFactoryUSA();
        contactoFactory ukFactory = new ContactoFactoryUK();
        contactoFactory moldaviaFactory = new ContactoFactoryMoldavia();

        libroDeContactos.addContacto(usFactory, "Luxening 573", "Afilon", "62701", "IL", "727", "4118-8461");
        libroDeContactos.addContacto(ukFactory, "Dolin 17", "Londres", "XR2 2BL", "", "36", "50 3919 3285");
        libroDeContactos.addContacto(moldaviaFactory, "Stefan celo Mare 202", "Chisinau", "2367", "", "373", "22 372 868");

        libroDeContactos.mostrarContacts();
    }
}