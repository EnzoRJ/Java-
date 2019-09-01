public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Enzo",4000);
        Empleado e2 = new Empleado("Enzo",4000);
        compararObjetos(e1,e2);
    }
    public static void compararObjetos(Empleado e1,Empleado e2){
        System.out.println("Contenido objeto: "+e1);
        if (e1==e2){
            System.out.println("Los objetos tienen la misma direccion de memoria");
        }
        else
            System.out.println("Los objetos tienes diferente direccion de memoria");
        //REVISION MODO EQUALS
        if (e1.hashCode()==e2.hashCode()){
            System.out.println("Los objetos tienen el mismo contenido");
        }
        else
            System.out.println("Los objetos NO tienen el mismo contenido");
        //Metodo hashCode
        if (e1.hashCode()==e2.hashCode()){
            System.out.println("Los objetos tienen el mismo codigo hash");
        }
        else
            System.out.println("Los objetos NO tienen el mismo codigo hash");
    }

}
