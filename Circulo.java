package abstracto.domain;

public class Circulo extends FiguraGeometrica {
    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        //getclass.simplename se accede al nombre de la clase
        System.out.println("Aqui se deberia dibujar un: "+this.getClass().getSimpleName());
    }
}
