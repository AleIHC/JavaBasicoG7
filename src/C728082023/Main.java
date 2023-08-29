package C728082023;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Para crear nueva instancia:
        //Indicamos el tipo de dato + el nombre de la variable +
        /*
        Calculadora calculadoraSinMarca = new Calculadora();
        //Si imprimimos directamente el objeto, nos imprime el lugar donde se aloja
        System.out.println(calculadoraSinMarca);
        //Accedemos a un método de instancia
        System.out.println(calculadoraSinMarca.suma(5,5));
        //Acceder a los atributos
        Calculadora calculadoraCasio = new Calculadora("Plata", 10.00,
                5.00, "Casio", true, 10, 15);
        System.out.println(calculadoraCasio.toString());

        ArrayList<Chocolate> cajaDeChocolates = new ArrayList<>();

        System.out.println("Iniciamos la fabrica de chocolates");
        for (int i = 0; i < 10; i++) {
            Chocolate chocolateNuevo = new Chocolate("Grande", "Chocolate", "Amargo",
                    "Rectangular", 50);
            cajaDeChocolates.add(chocolateNuevo);
            System.out.println("El chocolate número: " + i + " tiene las siguientes características: " + chocolateNuevo);
        }
         */

        CalculadoraCientifica calculadoraCasioC = new CalculadoraCientifica();
        //System.out.println(calculadoraCasioC.resta(50, 20));
        //System.out.println(calculadoraCasioC.datosTrignometricos("Seno"));
        Calculadora calculadoraNormal = new Calculadora();
        //Ejemplo de polimorfismo mediante sobreescritura
        System.out.println("En la clase padre el método da como resultado: " + calculadoraNormal.resta(10,5));
        System.out.println("**********************");
        System.out.println("En la clase hija el método da como resultado: " + calculadoraCasioC.resta(10,5));

        //Ejemplo de polimorfismo mediante sobrecarga
        System.out.println("En la clase padre el método da como resultado: " + calculadoraNormal.suma(10,5));
        System.out.println("**********************");
        System.out.println("En la clase hija el método da como resultado: " + calculadoraCasioC.suma(10.43,5.55));




    }
}
