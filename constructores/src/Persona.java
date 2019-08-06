public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private int contadorPersonas;

    private Persona() {
        this.idPersona=++contadorPersonas;
    }

    public Persona(String nombre, int edad) {
        this();
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}