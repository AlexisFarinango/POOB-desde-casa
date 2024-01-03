import java.util.Scanner;
import java.util.InputMismatchException;

public class Comida {
    public String nombre;
    public double precio;
    public String sabor;
    public Comida(String nombre,double precio,String sabor) {
        this.nombre = nombre;
        this.precio = precio;
        this.sabor = sabor;
    }
    public void mostrar_info(){
        System.out.print("La nombre del platillo es "+nombre+" con un precio de "+precio+" y su sabor es "+sabor+"\n");
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
class Ciudad extends Comida{
    public String ciudad;
    public Ciudad(String nombre, double precio, String sabor,String ciudad){
        super(nombre,precio,sabor);
        this.ciudad = ciudad;
    }
}
class Sector extends Ciudad{
    public String sector;
    public Sector(String nombre, double precio, String sabor, String ciudad, String sector){
        super(nombre,precio,sabor,ciudad);
        this.sector =sector;
    }
}
class Vendedor extends Sector {
    public String nombre_vendedor;

    public Vendedor(String nombre, double precio, String sabor, String ciudad, String sector, String nombre_vendedor) {
        super(nombre, precio, sabor, ciudad, sector);
        this.nombre_vendedor = nombre_vendedor;
    }

    public void ganador() {
        System.out.print("El platillo ganador es " + nombre + " con su vendedor " + nombre_vendedor + "\n");
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int num_parti;
        try {
            do{
                System.out.print("Ingrese el numero de participantes: ");
                num_parti = dato.nextInt();
                if(num_parti<=2) {
                    System.out.println("No se permiten numeros negativos ni menos de 3 participantes");
                }
            }while(num_parti<=2);
            String[] Platillos = new String[num_parti];
            for (int i = 0; i < num_parti; i++) {
                System.out.print("Ingrese el nombre del participante " + (i + 1) + " :");
                String nombre_parti = dato.next();
                Platillos[i] = nombre_parti;
            }
            Comida plato1 = new Comida("Encebollado", 3.50, "Salado");
            System.out.println("Nombre Anterior: " + plato1.getNombre());
            plato1.setNombre(Platillos[0]);
            System.out.println("Nombre Actual: " + plato1.getNombre());
            Ciudad plato2 = new Ciudad("Cangrejo", 6.50, "Salado", "Esmeraldas");
            System.out.println("Nombre Anterior: " + plato2.getNombre());
            plato2.setNombre(Platillos[1]);
            System.out.println("Nombre actual: " + plato2.getNombre());
            Vendedor plato3 = new Vendedor("Fritada", 8.25, "Salado", "Quito", "Norte", "Doña Pepita");
            System.out.println("Nombre anterior: " + plato3.getNombre());
            plato3.setNombre(Platillos[2]);
            System.out.println("Nombre actual: " + plato3.getNombre());
            plato1.mostrar_info();
            plato2.mostrar_info();
            plato3.ganador();
        } catch (InputMismatchException ex) {
            System.out.println("Valor ingresado incorrecto.");
        }
    }
}