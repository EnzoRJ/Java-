public class Persona {

        private String nombre,direccion;
        private char genero;
        private int edad;
        public Persona(){

        }
        public Persona(String nombre){

        }

        public Persona(String nombre, String direccion, char genero, int edad) {
                this.nombre = nombre;
                this.direccion = direccion;
                this.genero = genero;
                this.edad = edad;
        }
        @Override
        public String toString() {
                return "Persona{" +
                        "nombre='" + nombre + '\'' +
                        ", direccion='" + direccion + '\'' +
                        ", genero=" + genero +
                        ", edad=" + edad +
                        '}';
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getDireccion() {
                return direccion;
        }

        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }

        public char getGenero() {
                return genero;
        }

        public void setGenero(char genero) {
                this.genero = genero;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }


}
