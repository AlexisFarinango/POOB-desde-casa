import java.util.Scanner;
public class Arreglo {
    public static void main(String[] args){
        double numeros[];
        int dato1;
        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese el numero de datos para su arreglo: ");
        dato1 = num.nextInt();
        numeros = new double[dato1];
        for(int i=0; i<dato1;i++){
            System.out.print("Ingrese el numero "+(i+1)+" del arreglo:");
            Double datoingreso1= num.nextDouble();
            numeros[i] = datoingreso1;
        }
        System.out.println("Los datos ingresados fueron: \n");
        for(int i=0;i<dato1;i++){
            System.out.print(numeros[i]+", ");
        }
    }
}
