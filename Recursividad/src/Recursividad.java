public class Recursividad {
    public static void main(String[] args) {

    }
    public static int recursividad(int i){

        int res;

        if(i==1){
            return 1;
        }else{
            //Se llama a si misma la función con el parametro numero menos 1
            res = i+recursividad(i-1);
        }
        return res;
    }

    public static int factorialRecursivo(int numero){

        int res;

        if(numero==1){
            return 1;
        }else{
            res = numero * factorialRecursivo(numero-1);
        }
        return res;

    }
    public static void mostrarArrayRecursivo(int[] array, int indice){

        /*1º forma*/
        /*
        if (indice == (array.length-1)){
           System.out.println(array[indice]);
        }else{
            System.out.println(array[indice]);
            mostrarArrayRecursivo(array, indice+1);
        }
        */

        /*2º forma*/
        if (indice != array.length){
            //Se muestra el valor en ese indice
            System.out.println(array[indice]);
            mostrarArrayRecursivo(array, indice+1);
        }
    }
    public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){

        if(indice==array.length || array[indice]==elementoBuscar){
            if(indice==array.length){
                return -1;
            }else{
                return indice;
            }
        }else{
            return posicionElementoRecursivo(array, elementoBuscar, indice+1);
        }

    }
    public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {

        System.out.print(m[i][j] + " ");
        if (i != m.length - 1 || j != m[i].length - 1) {
            if (j == m[i].length - 1) {
                i++;
                j = 0;
                //Salto de linea (solo formato)
                System.out.println("");
            } else {
                //Paso a la siguiente columna
                j++;
            }
            recorrerMatrizRecursivo(m, i, j);
        }
    }
    public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
    public static int invertirNum(int num, int pos){

        //Si es menor que 10 devuelvo el numero (el ultimo numero)
        if(num < 10){
            return num;
        }else{
            return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
        }
    }
    public static String invertirPalabra(String palabra, int longitud){
        if(longitud==0){
            return palabra.charAt(longitud)+"";
        }else{
            return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
        }
    }
    public static double potencia(int base, int exponente) {
        if (exponente == 0) { //caso base
            return 1; //10^0 = 1
        } else if (exponente == 1) { //caso base
            return base; //10^1 = 10
        } else if (exponente < 0) { //Exponente negativo
            return potencia(base, exponente + 1) / base;
        } else {  //Exponente positivo
            return base * potencia(base, exponente - 1);
        }
    }
    public static int sumaDigitos(int numero){
        if(numero < 10){
            return numero;
        }else{
            return (numero % 10) + sumaDigitos(numero/10);
        }
    }




}


