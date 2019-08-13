package ejemploEnumeraciones;

public class ejemploNUmeraciones {
    public static void main(String[] args) {
        System.out.println("Valor 1: "+Dias.LUNES);
        indicarDia(Dias.LUNES);
        System.out.println("Continente n# 4: "+Continentes.AMERICA);
        System.out.println("Paises en America: "+ Continentes.AMERICA.getPaises());
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        System.out.println("");
        imprimirContinentes();
    }


public static void indicarDia(Dias dias){
    switch (dias){
        case LUNES:
            System.out.println("Primer dia de la semana");
            break;
        case MARTES:
            System.out.println("Segundo dia de la semana");
            break;
            default:
                System.out.println("Y asi seguimos con los dias de la semana");
        }
    }
    public static void indicarPaises(Continentes continentes){
        switch (continentes){
            case AFRICA:
                System.out.println("N# paises en "+continentes+": "+continentes.getPaises());
                default:
                    System.out.println("Y asi seguimos con los demas continentes");
        }
    }
    public static void imprimirContinentes(){
        for (Continentes c:Continentes.values()) {
            System.out.println("ContinenteL "+c+" contiene "+c.getPaises()+"paises");
        }
    }
}
