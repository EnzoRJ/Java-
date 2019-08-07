import com.enzo.Utileria;

//Puede llamarse directamiente metodo static
//import static com.enzo.Utileria.Imprimir;
//LLamando directamente al metodo y no a la clase

public class ejemploPaquetes {
    public static void main(String[] args) {
        Utileria.Imprimir("Aloooo");

        //Puede llamarse sin el import poniendo antes el com.enzo
        com.enzo.Utileria.Imprimir("kdsfkdsl");

    }
}
