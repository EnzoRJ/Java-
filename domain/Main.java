package abstracto.domain;
import abstracto.domain.*;

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        System.out.println("\n");
        System.out.println(triangulo);
        triangulo.dibujar();
        System.out.println("\n");
        System.out.println(circulo);
        circulo.dibujar();

    }
}
