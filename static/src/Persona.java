public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;


    public Persona(String nombre) {
        this.idPersona = contadorPersonas++;

        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", idPersona=" + idPersona +
                '}';
    }
}
