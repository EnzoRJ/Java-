public class empleado  extends Persona{

    private int idEmpleado;
    double sueldo;
    static int contadorEmpleados;

    public empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "empleado{" +
                "idEmpleado= " + idEmpleado +
                ", sueldo= " + sueldo +
                '}';
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
