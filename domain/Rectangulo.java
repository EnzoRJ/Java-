package abstracto.domain;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui se deberia dibujar un rectangulo: "+this.getClass().getSimpleName());
    }
}
