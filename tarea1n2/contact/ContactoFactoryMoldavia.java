package tarea1n2.contact;

import tarea1n2.direccion.Direccion;
import tarea1n2.direccion.DireccionMoldavia;
import tarea1n2.numero_telefono.NumeroTelefono;
import tarea1n2.numero_telefono.NumeroTelefonoMoldavia;

public class ContactoFactoryMoldavia implements contactoFactory {
    @Override
    public Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal) {
        return new DireccionMoldavia(calle, publacion, estado);
    }

    @Override
    public NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono) {
        return new NumeroTelefonoMoldavia(codPais, numeroTelefono);
    }
}