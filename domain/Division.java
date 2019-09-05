package domain;

import org.w3c.dom.ls.LSOutput;

public class Division {
    private double numerador, denominador;

    public Division(int numerador, int denominador) throws OperationException {

        if (denominador==0) {
            throw new OperationException("Denominador igual a 0");
        }
            this.numerador = numerador;
            this.denominador = denominador;
        }
        public void resultadoOperacion(){
            System.out.println("La division de "+numerador+ " y " +denominador+" es: "+numerador/denominador);
        }

    }

