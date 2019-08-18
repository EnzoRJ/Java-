package bloquesDeCodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    /*
    Static se asocia a la clase y no a objetos, de este modo
    al inicializaar la variable se necesite el static
     */
    static {
        contadorPersonas=10;
        System.out.println("Primer bloque de codigo");
    }
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona=++contadorPersonas;
    }
    Persona(){
        System.out.println("Ejecuta constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
