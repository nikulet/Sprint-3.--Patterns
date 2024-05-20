package tarea1n2.direccion;

public class DireccionUK implements Direccion {
    private final String calle;
    private final String publacion;
    private final String codigoPostal;
    final String pais;

    public DireccionUK(String calle, String publacion, String codigoPostal) {
        this.calle = calle;
        this.publacion = publacion;
        this.codigoPostal = codigoPostal;
        this.pais = "Inglaterra";
    }

    @Override
    public String getDireccionCompleta() {
        return "Calle " + calle + ", publacion " + publacion + ", codigo postal " + codigoPostal + ", pais " + pais;
    }
}