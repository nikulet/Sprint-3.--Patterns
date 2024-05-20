package tarea1n2.contact;

import tarea1n2.direccion.Direccion;
import tarea1n2.numero_telefono.NumeroTelefono;

public interface contactoFactory {
    Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal);
    NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono);
}

