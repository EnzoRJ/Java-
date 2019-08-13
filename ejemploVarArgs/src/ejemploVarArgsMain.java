public class ejemploVarArgsMain {
    public static void main(String[] args) {
        imprimirNUmeros(1,2,3,4,5,6,7);
        imprimirNumerosForEach(5,6,7,8,9,0,9,8,7,6,5);
        variosParametros("Hola",true,34,56,67,67,89,87,76,33,99,84);

    }
    public static void imprimirNUmeros(int... numeros) {
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("Elemento n# "+i+" = "+elemento);
        }
        System.out.println("");
    }
    public static void imprimirNumerosForEach(int... numeros){
        for (int elem:numeros) {
            System.out.println("El elemento tiene el valor: "+elem);
        }
        System.out.println("");
    }
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Es valido?: "+valido);
        for (int nums:numeros) {
            System.out.println("Numero: "+nums);
        }
    }
}
