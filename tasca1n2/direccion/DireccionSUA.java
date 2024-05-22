package tasca1n2.direccion;

    // Dirección concreta para Estados Unidos
    public class DireccionSUA implements Direccion {
        private final String calle;
        private final String publacion;
        private final String codigoPostal;
        private final String state;
        final String pais;

        public DireccionSUA(String calle, String publacion, String codigoPostal, String state) {
            this.calle = calle;
            this.publacion = publacion;
            this.codigoPostal = codigoPostal;
            this.state = state;
            this.pais = "Estados Unidos";
        }

        @Override
        public String getDireccionCompleta() {
            return "Calle " + calle + ", publacion " + publacion + ", estado " + state + " , codigo postal " + codigoPostal + ", pais " + pais;
        }
    }