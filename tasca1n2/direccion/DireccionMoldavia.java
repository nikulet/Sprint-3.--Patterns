package tasca1n2.direccion;

public class DireccionMoldavia implements Direccion {
    private final String calle;
    private final String publacion;
    private final String codigoPostal;
    final String pais;

    public DireccionMoldavia(String calle, String publacion, String codigoPostal) {
        this.calle = calle;
        this.publacion = publacion;
        this.codigoPostal = codigoPostal;
        this.pais = "Moldavia";
    }

    @Override
    public String getDireccionCompleta() {
        return "Calle " + calle + ", publacion " + publacion + ", codigo postal " + codigoPostal + ", pais " + pais;
    }
}