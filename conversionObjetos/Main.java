package conversionObjetos;

public class Main {

    public static void main(String[] args) {
	Empleado empleado;
	empleado = new Escritor("Enzo",150000,TipoEscritura.MODERNO);

	imprimirEmpleado(empleado);

	empleado = new Gerente("Par",30000,"Sistemas");
	imprimirEmpleado(empleado);
    }
    private static void imprimirEmpleado(Empleado empleado){
        String resultado = null;
        System.out.println("\nDetalle: "+empleado.toString());

        //Downcasting para detalles de la clase
        if (empleado instanceof Escritor){
            Escritor escritor = (Escritor) empleado;
            resultado = escritor.getTipoDeEscrituraEnTexto();

            //Conversion en la misma linea evitando variables
            resultado = ((Escritor)empleado).tipoEscritura.getDescripcion();
            System.out.println("resultado escritura "+ resultado);
        }
        else if (empleado instanceof Gerente){
            resultado = ((Gerente)empleado).getDepartamento();
            System.out.println("resultado departamento: "+resultado);
        }

    }
}
