package datos;


//Implemens se utiliza al haber una interfaz el lungar del extends de una clase
public class ImplementacionOracle implements AccesoDatos{
    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }
}
