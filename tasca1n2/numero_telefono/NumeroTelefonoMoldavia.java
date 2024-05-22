package tasca1n2.numero_telefono;

public class NumeroTelefonoMoldavia implements NumeroTelefono {
    private final String codPais;
    private final String numeroTelefono;

    public NumeroTelefonoMoldavia(String codPais, String numeroTelefono) {
        this.codPais = codPais;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String getNumeroTelefono() {
        return "+" + codPais + " " + numeroTelefono;
    }
}
