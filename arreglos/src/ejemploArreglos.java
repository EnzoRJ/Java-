
import java.util.Scanner;
public class ejemploArreglos {
    public static void main(String[] args) {

    //1ra forma de declarar un arreglo
    int [] cadenaNumeros = new int[10];
    //2da forma de declarar un arreglo
    int[] cadenaNumeros2={1,2,3,4,5,6,7,};
    for (int i = 0;i<cadenaNumeros.length;i++){
        System.out.println(i);
    }
    String[] cadenaNombres = new String[5];
    for (int i = 0;i<cadenaNombres.length;i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre a la posicion "+(i+1));
        cadenaNombres[i] = sc.nextLine();
        }
        System.out.println("Lista de nombres");
        for (int i = 0; i <cadenaNombres.length ; i++) {
            System.out.println("Posicion "+(i+1)+" tiene el nombre de " +cadenaNombres[i]);
        }
        int[]edades=new int[3];
        edades[0] = 30;
        edades[1] = 44;
        Persona []persona = new Persona[3];
        persona[0] = new Persona("ENzo");
        persona[1] = new Persona("Pars");

        for (int i = 0; i <edades.length ; i++) {
            System.out.println(persona[i]);
            System.out.println(edades[i]);

        }
    }

}
class Persona{
    String nombre;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
