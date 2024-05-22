package tasca1n2.contact;

import tasca1n2.direccion.Direccion;
import tasca1n2.direccion.DireccionUK;
import tasca1n2.numero_telefono.NumeroTelefono;
import tasca1n2.numero_telefono.NumeroTelefonoUK;

public class ContactoFactoryUK implements ContactoFactory {
    @Override
    public Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal) {
        return new DireccionUK(calle, publacion, estado);
    }

    @Override
    public NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono) {
        return new NumeroTelefonoUK(codPais, numeroTelefono);
    }
}