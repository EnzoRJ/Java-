
package ventas;
import com.enzo.ventas.*;

public class ventas {
    public static void main(String[] args) {
        //Creacion de objetos -productos-
        Producto producto1 = new Producto("Compu", 100000);
        Producto producto2 = new Producto("Telefono", 10000);
        //Creacion de Ordenes
        Orden orden1 = new Orden();
        //Agregar productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2 );
        //Mostrar orden
        orden1.mostrarOrden();
    }

}
