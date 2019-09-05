
import domain.*;
public class Main {

    public static void main(String[] args) {
        try {
            Division division = new Division(10,8);
            division.resultadoOperacion();
        }catch (OperationException oe) {
            System.out.println("Ucurrio un error");
            oe.printStackTrace();
        }
    }
}
