package tasca1n2.numero_telefono;

public class NumeroTelefonoUSA implements NumeroTelefono {
    private final String codPais;
    private final String numeroelefono;

    public NumeroTelefonoUSA(String codPais, String numeroelefono) {
        this.codPais = codPais;
        this.numeroelefono = numeroelefono;
    }

    @Override
    public String getNumeroTelefono() {
        return "(" + codPais + ") " + numeroelefono;
    }
}