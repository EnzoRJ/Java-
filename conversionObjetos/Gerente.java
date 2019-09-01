package conversionObjetos;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre,sueldo);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " departamento " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}