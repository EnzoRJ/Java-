import com.cl.mundopc.*;

public class mundoPc {
    public static void main(String[] args) {
        Monitor Toshiba1 = new Monitor("Monitor Acer",27);
        Raton Logitech1 = new Raton("Bluetooth","Logitech");
        Teclado Corsair1 = new Teclado("Bluetooth","Corsair");
        Computadora computadoraToshiba=new Computadora("Computadora 1 Toshiba",Toshiba1,Corsair1,Logitech1);
        Orden orden = new Orden();
        orden.mostrarOrden();
        //creacion de computadora dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //creacion de computadora armada
        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, Corsair1, Logitech1);

        //Agregamos las computadoras a la orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraToshiba);
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuArmada);
        //Imprimimos la orden
        orden1.mostrarOrden();

        //Agregamos una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuArmada);
        orden2.agregarComputadora(compuDell);
        System.out.println("");
        orden2.mostrarOrden();
    }
}
