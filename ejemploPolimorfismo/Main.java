package com.company;

public class Main {

    public static void main(String[] args) {
        Empleado emp = new Empleado("Enzo",10000);
        imprimirDetalles(emp);
        Gerente ger = new Gerente("Por",20000,"RRHH");
        imprimirDetalles(ger);
    }
    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.toString());
    }
}
