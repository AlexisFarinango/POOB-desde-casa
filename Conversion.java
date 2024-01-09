import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un valor a realizar la conversion: ");
        int valor_obtenido = entrada.nextInt(); //obtener un valor int y guardarlo en una variable

        //Realizar operacion

        int valor_entero;
        double valor_float;

        //opcion1
        valor_float = (double) valor_obtenido;
        System.out.println("El nuevo tipo de dato del valor "+valor_float+" es "+((Object)valor_float).getClass().getSimpleName());

        //opcion2
        System.out.print("Ingrese un valor numerico a convertir: ");
        String valor_str = entrada.next();
        int valor_int_nuevo = 50;
        //Convertir la variable input de tipo String a un tipo de dato int y almacenarlo en una nueva variable
        int str_to_int = Integer.parseInt(valor_str);

        int multiplicacion = str_to_int * valor_int_nuevo;
        //Imprimir el resultado de la operacion del valor int con el nuevo valor convertido (str a int)
        System.out.println("El resultado de la operacion es: "+multiplicacion);
    }
}