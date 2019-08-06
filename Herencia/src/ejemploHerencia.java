import java.util.Date;

public class ejemploHerencia {
    int i = 1;
    public static void main(String[] args) {
        empleado emp1 = new empleado("Enzo",10000);
        System.out.println(emp1);
        emp1.setDireccion("Calle 122");
        emp1.setEdad(34);
        emp1.setGenero('M');
        emp1.setNombre("Parso");
        System.out.println(emp1);

        cliente cli1 = new cliente(new Date(), true);
        System.out.println(cli1);
        cli1.setNombre("Parsa");
        cli1.setDireccion("Pasaje 7");
        cli1.setGenero('F');
        System.out.println(cli1);
    }
}
