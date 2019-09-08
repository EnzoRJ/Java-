package datos;
import exceptions.AccesoDatosEx;

public interface AccesoDatos {
    public  void insertar() throws AccesoDatosEx;
    public  void listar() throws AccesoDatosEx;
    public  void simularError(boolean simularError);

}
