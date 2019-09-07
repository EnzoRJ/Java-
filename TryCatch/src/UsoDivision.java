
import java.util.InputMismatchException;
import java.util.Scanner;
public class UsoDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuarCiclo=true;
        do {
            try {
                System.out.println("Ingresa un numero a dividir");
                int numerador = sc.nextInt();
                System.out.println("Ingresa el denominador");
                int denominador = sc.nextInt();
                int resultado =Operaciones.cuociente(numerador,denominador);
                System.out.println("Resultado de la division de "+numerador+" / "+denominador+" : "+resultado);
            }catch (InputMismatchException ex){
                System.out.println("Ingresaste un valor no numero entero");
                sc.nextLine();
            }catch (ArithmeticException ex){
                System.out.println("Has ingresado un 0 \n No se puede divir un numero en 0");
                System.out.println("Se ha producido la Excepcion: "+ex);
            }
        } while (continuarCiclo);
    }
} class Operaciones {
    public static int cuociente(int numerador, int denominador) throws ArithmeticException{
        return numerador/denominador;
    }
}
class ArrayIndexExceptionDemo
{
    public static void main(String args[])
    {
        try{
            int a[]=new int[10];
            //El arreglo solo tiene 10 elementos y se intenta acceder al elemento con el índice 11
            //cuando en realidad este arreglo solo tiene hasta el índice 9 (empieza a contar desde cero).
            a[11] = 26;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds");
        }
    }
}
class NumberFormatExceptionDemo
{
    public static void main(String args[])
    {
        try{
            int numero = Integer.parseInt ("Java") ;
            System.out.println(numero);
        }catch(NumberFormatException e){
            System.out.println("Una excepción Number Format ha ocurrido");
        }
    }
}
class StringIndexExDemo
{
    public static void main(String args[])
    {
        try{
            String str="pasos sencillos para aprender programación";
            System.out.println(str.length()); // esto imprime 42 lo que indica que tenemos hasta el índice 41

            char c = str.charAt(50); //Esto produce una excepcion
            System.out.println(c);

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
        }
    }
}
class NullPointerExDemo
{
    public static void main(String args[])
    {
        try{
            //referencia String apunta a un objeto null
            String str=null;
            //se intenta imprimir la dimensión de un objeto String no inicializado
            System.out.println (str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException..");
        }
    }
}

