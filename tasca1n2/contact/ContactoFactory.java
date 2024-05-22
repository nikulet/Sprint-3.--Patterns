package tasca1n2.contact;

import tasca1n2.direccion.Direccion;
import tasca1n2.numero_telefono.NumeroTelefono;

public interface ContactoFactory {
    Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal);
    NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono);
}

