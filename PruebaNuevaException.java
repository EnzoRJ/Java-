import java.util.Scanner;

 public class PruebaNuevaException {

    private int numero;
    private Scanner sc;

    public void IntroducirNumero()throws NuevasExceptions {
        try{
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa un numero");
                numero = sc.nextInt();
                if (numero==0){
                    throw new NuevasExceptions();
                }
            } while (numero !=0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static void main(String[] args) {
        try{
            new PruebaNuevaException().IntroducirNumero();
        }catch (NuevasExceptions ex){
            System.out.println("Has ingresado un 0");
        }



     }
}



