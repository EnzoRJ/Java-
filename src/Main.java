public class Main {

    public static void main(String[] args) {
        figuraGeometrica figura = new figuraGeometrica();
        figura = new Elipse();
        determinarTipoFigura(figura);
        determinarTodosLosTipos(figura);
    }

    private static void determinarTipoFigura(figuraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Es un elipse");
        } else if (figura instanceof Circulo) {
            System.out.println("Es un circulo");
        } else if (figura instanceof Rectangulo) {
            System.out.println("Es un rectangulo");
        } else if (figura instanceof figuraGeometrica) {
            System.out.println("Es una figura geometrica");
        } else {
            System.out.println("No se encontro el tipo de objeto");
        }
    }
    private static void determinarTodosLosTipos(figuraGeometrica figura){
        if (figura instanceof Elipse) {
            System.out.println("Es un elipse");
        } if (figura instanceof Circulo) {
            System.out.println("Es un circulo");
        } if (figura instanceof figuraGeometrica) {
            System.out.println("Es una figura geometroca");
        } if (figura instanceof Object){
            System.out.println("Es un tipo Object");
        } else{
            System.out.println("No se descubrio su tipo");
        }
    }
}

