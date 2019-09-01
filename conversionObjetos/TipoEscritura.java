package conversionObjetos;

public enum TipoEscritura {
    CLASICO("ESCRITURA A MANO"),
    MODERNO("ESSCRITURA DIGITAL");
    private final String descripcion;

    TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}


