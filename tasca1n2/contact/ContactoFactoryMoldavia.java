package tasca1n2.contact;

import tasca1n2.direccion.Direccion;
import tasca1n2.direccion.DireccionMoldavia;
import tasca1n2.numero_telefono.NumeroTelefono;
import tasca1n2.numero_telefono.NumeroTelefonoMoldavia;

public class ContactoFactoryMoldavia implements ContactoFactory {
    @Override
    public Direccion crearDireccion(String calle, String publacion, String estado, String codigoPostal) {
        return new DireccionMoldavia(calle, publacion, estado);
    }

    @Override
    public NumeroTelefono crearNumeroTelefono(String codPais, String numeroTelefono) {
        return new NumeroTelefonoMoldavia(codPais, numeroTelefono);
    }
}