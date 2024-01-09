import java.util.Scanner;
public abstract class Carta {
    private String nombre;
    public Carta(String nombre){
        this.nombre = nombre;
    }
    public abstract void jugar();
    public abstract void mostrarDescripcion();

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
class CartaNumerica extends Carta{
    private int numero;
    public CartaNumerica(int numero, String nombre){
        super(nombre);
        this.numero = numero;
    }
    @Override
    public void jugar(){
        System.out.println("la carta con la que empiezas a jugar es:"+numero);
    }
    @Override
    public void mostrarDescripcion(){
        System.out.println("La Descripcion de la carta:"+numero +" es "+ getNombre());
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
}
class CartaEspecial extends Carta{
    public CartaEspecial(String nombre){
        super(nombre);
    }
    @Override
    public void jugar(){
        System.out.println("Se jugo la carta especial "+getNombre());
    }
    @Override
    public void mostrarDescripcion(){
        System.out.println("Al jugar esta carta activas un combo ya que es:"+getNombre());
    }
    public void activarefectoespecial(){
        System.out.println("Se activa el efecto de: "+getNombre());
    }
    public static void main(String[] args){
        Scanner dato1 = new Scanner(System.in);
        CartaNumerica cartan = new CartaNumerica(7, "Gira a la derecha");
        CartaEspecial cartaespe = new CartaEspecial("Todos pierden");
        CartaNumerica cambios = new CartaNumerica(7,"Saludar");
        cartan.jugar();
        cartan.mostrarDescripcion();
        cartaespe.jugar();
        cartaespe.mostrarDescripcion();
        cartaespe.activarefectoespecial();
        cambios.mostrarDescripcion();
        cambios.setNumero(9);
        cambios.mostrarDescripcion();
        try{
            int multiplicacion= 6;
            System.out.print("Ingrese el numero de la carta: ");
            double numcarta1 = dato1.nextDouble();
            int cartadouble = (int)numcarta1;
            double total = cartadouble*multiplicacion;
            System.out.println("La carta multiplicada por 6 da un valor de: "+total +" puntos para ti");
        }catch (Exception ex){
            System.out.println("Se encuentra ingresando caracteres");
        }
        System.out.print("Programa terminado");
    }
}
