public class Profesor  extends Persona{

        public String Cargo_materia;

        public Profesor (String Nombre, int Edad,String Cargo_materia) {
            super(Nombre,Edad);
            this.Cargo_materia=Cargo_materia;
        }
        public void saludar(){
            System.out.println(" hola soy "+Nombre+" tengo "+Edad+"años"+" y estoy a cargo de la materia de :  "+Cargo_materia);
        }
}
