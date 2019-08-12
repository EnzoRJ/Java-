package com.cl.mundopc;

public class Orden {
    private int idOrden;
    private final Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras = 10;

    public Orden() {
        this.idOrden=++contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        //Si las computadoras agregadas no superan al máximo de computadoras
        //agregamos la nueva computadora
        if (contadorComputadoras < maxComputadoras) {
            //Agregamos la nueva computadora al arreglo
            //e incrementamos el contador de computadoras
            computadoras[contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " + maxComputadoras);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden#: "+idOrden);

        System.out.println("Computadoras en la orden # "+idOrden+" :");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
