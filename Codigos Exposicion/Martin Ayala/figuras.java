// Clase figura
public class figuras {
    public void calcularArea() {
        System.out.println("Método calcularArea en la clase Figura");
    }
}
// Subclase Circulo que hereda de Figura
class circulo extends figuras {
    private double radio;

    // Constructor de la clase Circulo
    public circulo(double radio) {
        this.radio = radio;
    }

    // Sobreescritura del método calcularArea para un círculo
    @Override
    public void calcularArea() {
        double resultado;
        resultado = 3.1416 * radio *radio;
        System.out.println("El area del circulo es: "+resultado);
    }
    public static void main(String[] args) {
        circulo prueba1 = new circulo(5);
        prueba1.calcularArea();
    }
}
