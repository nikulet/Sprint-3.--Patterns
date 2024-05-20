package tarea1n2.contact;

import tarea1n2.direccion.Direccion;
import tarea1n2.direccion.DireccionSUA;
import tarea1n2.numero_telefono.NumeroTelefono;
import tarea1n2.numero_telefono.NumeroTelefonoUSA;

public class ContactoFactoryUSA implements contactoFactory {
    @Override
    public Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal) {
        return new DireccionSUA(calle, publacion, estado, codigoPostal);
    }

    @Override
    public NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono) {
        return new NumeroTelefonoUSA(codPais, numeroTelefono);
    }
}