public class staticMain {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        System.out.println(p1);
        Persona p2 = new Persona("Pors");
        System.out.println(p2);
        System.out.println("Total de personas: "+Persona.getContadorPersonas());


    }
}
