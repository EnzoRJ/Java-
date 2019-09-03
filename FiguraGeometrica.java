package abstracto.domain;

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //El metodo no se define en las clases abstractas
    //Las clases herederas pueden utilizarlos al instanciarlas
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "tipoFigura='" + this.tipoFigura ;
    }
}
