package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class UsoEmpleado {
    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Enzo",4000,34));
        listaEmpleados.add(new Empleado("Pedro", 3400,30));
        listaEmpleados.add(new Empleado("Juan", 3000,31));
        listaEmpleados.add(new Empleado("Carlos",2000,29));
        listaEmpleados.add(new Empleado("Gustavo", 4100,32));
        listaEmpleados.add(new Empleado("Francisco", 2900,27));
        listaEmpleados.set(1,new Empleado("caro",3000,28));
        //Obtiene posicion en especifico
        System.out.println(listaEmpleados.get(3));
        //Total de objetos
        System.out.println(listaEmpleados.size());
        //Establecer lugar para el ingreso
        listaEmpleados.set(0, new Empleado("Fran",15000,30));

        for (Empleado e:listaEmpleados) {
            System.out.println(e.toString());
        }
        System.out.println(" ");


        //Copiar arrayList a array normal
        Empleado arrayEmpleado[] = new Empleado[listaEmpleados.size()];
        listaEmpleados.toArray(arrayEmpleado);
        for (Empleado e:arrayEmpleado) {
            System.out.println(e.toString());

        }
        System.out.println("");
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);
        /* ArrayList before the sorting*/
        System.out.println("Antes de Sorting:");
        for(int counter: arraylist){
            System.out.println(counter);
        }

        //Ordenar un arrayList
        Collections.sort(arraylist);
        System.out.println("Despues del Sort:");
        for(int counter: arraylist){
            System.out.println(counter);
        }


        Iterator<Empleado> miIterador = listaEmpleados.iterator();
        while (miIterador.hasNext()){
            System.out.println(miIterador.next().toString());
        }
    }

}

