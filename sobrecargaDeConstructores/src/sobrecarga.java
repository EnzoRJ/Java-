public class sobrecarga {
    public static void main(String[] args) {

    }
}
 class Persona{
    String nombre;
    int edad;
    char genero;
    int contador;

     public Persona() {
     }
     public Persona(int edad){
         this.edad=edad;

     }


     public Persona(String nombre, int edad, char genero) {
         this.nombre = nombre;
         this.edad = edad;
         this.genero = genero;
     }
 }

