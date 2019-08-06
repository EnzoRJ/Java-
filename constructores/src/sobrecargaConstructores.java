public class sobrecargaConstructores {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan",22);
        System.out.println("Persona: "+ p1);
        Empleado emp1 = new Empleado("Pedo",22,50.000);
        System.out.println("Empleadoa; "+ emp1);

    }
}
