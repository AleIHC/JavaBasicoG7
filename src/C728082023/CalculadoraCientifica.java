package C728082023;

import java.util.ArrayList;

//Herencia es un pilar de la POO permite heredar atributos y métodos y en Java se utiliza mediante la palabra reservada extends
//Polimorfismo permite indicar un comportamiento propio para los métodos de una clase que hereda
public class CalculadoraCientifica extends Calculadora {

    //Atributos
    Boolean permiteCaracteresASCII;
    String tipoDePantalla;

    //Constructores
    public CalculadoraCientifica() {
    }

    public CalculadoraCientifica(Boolean permiteCaracteresASCII, String tipoDePantalla) {
        this.permiteCaracteresASCII = permiteCaracteresASCII;
        this.tipoDePantalla = tipoDePantalla;
    }

    //Métodos
    public String datosTrignometricos(String dato) {
        return "Estamos usando: " + dato;
    }

    //Para aplicar polimorfismo
    //Sobreescritura de métodos,es le estoy dando un nuevo comportamiento al método
    public Integer resta(int num1, int num2) {
        System.out.println("Hola estoy sobrescribiendo");
        return num1 - num2;
    }

    //Sobrecarga de métodos, declarar la función pero agregando más argumentos y estos pueden tener distintos tipos de dato
    public Double suma(double num1, double num2) {
        System.out.println("El resultado es: ");
        return num1 + num2 ;
    }



}
