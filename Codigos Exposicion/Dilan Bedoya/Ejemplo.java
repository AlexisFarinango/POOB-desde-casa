/*El encapsulamiento se refiere a la ocultación de los detalles internos de un objeto y a la
restricción del acceso directo a sus atributos y métodos desde fuera de la clase. Este concepto
 promueve la idea de que los detalles internos de un objeto deben ser
 privados y solo accesibles a través de métodos públicos, lo que ayuda a mantener un diseño más
 robusto y seguro.*/

/* encapsulamiento en programación orientada a objetos es un principio fundamental que promueve la
ocultación de los detalles internos de un objeto y restringe el acceso directo a sus atributos y métodos
desde fuera de la clase.

El uso de getters y setters proporciona una interfaz controlada para interactuar con los atributos
encapsulados, permitiendo la validación y manipulación de datos de manera controlada.*/


public class Ejemplo {
    private int valor;  // Atributo encapsulado

    // Constructor
    public Ejemplo(int valorInicial) {
        this.valor = valorInicial;
    }

    // Método setter
    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método getter para acceder al atributo encapsulado
    public int getValor() {
        return this.valor;
    }

    // Método que realiza alguna operación utilizando el atributo encapsulado
    public void realizarOperacion() {
        System.out.println("Nuevo valor: " + this.valor);
        // Lógica de la operación
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Ejemplo
        Ejemplo miEjemplo = new Ejemplo(5);

        // Acceder al valor encapsulado utilizando el getter
        System.out.println("Valor actual: " + miEjemplo.getValor());

        // establecer un valor al objeto con metodo set
        miEjemplo.setValor(10);

        // Realizar una operación utilizando el método de la clase
        miEjemplo.realizarOperacion();
    }
}

