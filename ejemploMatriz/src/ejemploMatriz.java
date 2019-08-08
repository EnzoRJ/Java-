
import java.util.Scanner;
public class ejemploMatriz {
    public static void main(String[] args) {

    Persona [][]personas = new Persona[2][2];
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i <personas.length ; i++) {
            for (int j = 0; j <personas[i].length ; j++) {
                System.out.println("Ingresa nombre para la Fila: "+i+" Columna: "+j);
                personas[i][j] = new Persona(sc.nextLine());
            }
        }
        for (int i = 0; i <personas.length ; i++) {
            for (int j = 0; j <personas[i].length ; j++) {
                System.out.println("Fila: "+i+" Columna: "+j+" "+personas[i][j]);
            }
        }
    }
}
class Persona{
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

