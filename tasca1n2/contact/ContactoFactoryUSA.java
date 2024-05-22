package tasca1n2.contact;

import tasca1n2.direccion.Direccion;
import tasca1n2.direccion.DireccionSUA;
import tasca1n2.numero_telefono.NumeroTelefono;
import tasca1n2.numero_telefono.NumeroTelefonoUSA;

public class ContactoFactoryUSA implements ContactoFactory {
    @Override
    public Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal) {
        return new DireccionSUA(calle, publacion, estado, codigoPostal);
    }

    @Override
    public NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono) {
        return new NumeroTelefonoUSA(codPais, numeroTelefono);
    }
}