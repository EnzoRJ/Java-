package arraylist;

public class Empleado {
    private String nombre;
    private double sueldo;
    private int edad;

    public Empleado(String nombre, double sueldo, int edad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", edad=" + edad +
                '}';
    }
}
