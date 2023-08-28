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
        */

        ArrayList<Chocolate> cajaDeChocolates = new ArrayList<>();

        System.out.println("Iniciamos la fabrica de chocolates");
        for (int i = 0; i < 10; i++) {
            Chocolate chocolateNuevo = new Chocolate("Grande", "Chocolate", "Amargo",
                    "Rectangular", 50);
            cajaDeChocolates.add(chocolateNuevo);
            System.out.println("El chocolate número: " + i + " tiene las siguientes características: " + chocolateNuevo);
        }
    }
}
