package com.enzo.ventas;

public class Orden {
    private int idORden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int maxProductos=10;


    public Orden() {
        this.idORden = ++contadorOrdenes;
        productos = new Producto[maxProductos];
    }
    public void agregarProducto(Producto producto){
        //mientras los articulos no superen el max agregamos al arreglo
        if (contadorProductos<=maxProductos){
            //Agregar contador de productos
            productos[contadorProductos++] = producto;
        }
        else {
            System.out.println("Se ha superado el limite de productos ("+ maxProductos+")");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i <contadorProductos ; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
                System.out.println("Orden #: "+idORden);
        for (int i = 0; i < contadorProductos ; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total de la orden "+calcularTotal());


    }
}
