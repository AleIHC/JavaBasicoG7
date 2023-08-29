package C728082023;

public class Calculadora {

    //Atributos
    String color;
    Double alto;
    Double ancho;
    String marca;
    //Boolean esCientifica;
    Integer memoria;
    Integer cantidadMaxDeDigitos;

    //Constructores, método responsable de instanciar el objeto
    //Constructor vacío, permite crear la instancia sin indicar ninguna característica en concreto
    public Calculadora() {
    }

    //Constructor lleno
    public Calculadora(String color, Double alto, Double ancho, String marca, Boolean esCientifica, Integer memoria, Integer cantidadMaxDeDigitos) {
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
        this.marca = marca;
        this.memoria = memoria;
        this.cantidadMaxDeDigitos = cantidadMaxDeDigitos;
    }

    //Métodos de instancia
   public Integer suma(int num1, int num2) {
        return num1 + num2;
    }

    public Integer resta(int num1, int num2) {
        return num1 - num2;
    }

    //Métodos de la clase
    public static Integer multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    public static Integer divicion(int num1, int num2) {
        return num1 / num2;
    }
    public static Integer resto(int num1, int num2 ) {
        return num1 % num2;
    }
    public static Integer incremento(int num1) {
        return ++num1;
    }
    public static Integer decremento(int num1) {
        return --num1;
    }

    //Método toString, permite imprimir objeto como String en vez de la dirección en memoria
    @Override
    public String toString() {
        return "Calculadora{" +
                "color='" + color + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", marca='" + marca + '\'' +
                ", memoria=" + memoria +
                ", cantidadMaxDeDigitos=" + cantidadMaxDeDigitos +
                '}';
    }
}
