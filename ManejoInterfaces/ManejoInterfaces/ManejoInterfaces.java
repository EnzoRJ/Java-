package ManejoInterfaces;
import datos.*;

public class ManejoInterfaces {
    public static void main(String[] args) {


        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");
        datos = new ImplementacionMySQL();
        ejecutar(datos, "insertar");

    }
    private static void ejecutar(AccesoDatos datos, String accion){
        if ("listar".equals(accion)){
            datos.listar();
        }
        else if ("insertar".equals(accion)){
            datos.insertar();
        }
    }

}

