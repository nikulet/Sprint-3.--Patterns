package tarea1n2.contact;

import tarea1n2.direccion.Direccion;
import tarea1n2.direccion.DireccionUK;
import tarea1n2.numero_telefono.NumeroTelefono;
import tarea1n2.numero_telefono.NumeroTelefonoUK;

public class ContactoFactoryUK implements contactoFactory {
    @Override
    public Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal) {
        return new DireccionUK(calle, publacion, estado);
    }

    @Override
    public NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono) {
        return new NumeroTelefonoUK(codPais, numeroTelefono);
    }
}