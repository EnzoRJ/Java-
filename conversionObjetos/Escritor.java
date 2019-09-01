package conversionObjetos;

public class Escritor  extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo escritura"+ tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    public String getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
}
