public class palabraThis {
    public static void main(String[] args) {
        Persona pers = new Persona("Enzo");
    }
}

    class Persona{
        String nombre;

        Persona(String nombre) {
            this.nombre = nombre;

            //Imprimir objeto imprimir
            Imprimir imp = new Imprimir();
            imp.imprimir(this);


        }
    }
    class Imprimir{
        public void imprimir(Persona p){
            System.out.println("Impresion argumentos = "+ p);
            System.out.println("Impresion objeto actual (this) = "+ this);
        }
    }

