package C723082023;

import java.util.Random;
import java.util.Scanner;

public class Condicionales {

    public static void main (String[] args) {

        //System.out.println("Está funcionando");

        //OPERADORES
        //Aritméticos(+, -, /, *, %, ++, --, =, +=, -=)

        Integer num1 = 5;
        Integer num2 = 3;
        Integer num3 = 5;
        Integer num4 = 3;
        Integer suma = num1 + num3;
        //System.out.println("El cociente de la división es: " + (num1 % num2));


        //Comparación(<, >, !=, ==, <=, >=), dan como resultado un boolean
        //System.out.println(num1 == num3);
        //System.out.println(num1 != num2);


        //Lógicos(&&, ||, !) = "y", "o" y el "not"
        // && evalúa que ambas expresiones sean verdaderas y si alguna de las dos es falsa el resultado es falso
        // ||
        /*
        System.out.println("El resultado es :" + ((num1 == num3) && (num2 == num3)));
        System.out.println("El resultado de las comparaciones es :" + (((num1 == num4) || (num1 == num3)) && (num4 == num1)));
        System.out.println(!(num1 == num3));

        //Condicionales
        //"Si la expresión es verdadera, haz esto si no, haz esto otro"
        if(num1 == num4) {
            System.out.println("Es verdadero");
        } else if (suma >= 10) {
            System.out.println("Lo lograste!");
        } else {
            System.out.println("Es falso");
        }*/

        /**SWITCH CASE**/
        /*
        //Se utiliza cuando tenemos muchas alternativas posibles
        Integer numRandom = (int) Math.round(Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa un número del 1 al 10");
        Integer numEscogido = scanner.nextInt();

        switch (numEscogido) {
            case 1 -> System.out.println("1era puerta");
            case 2 -> System.out.println("2da puerta");
            case 3 -> System.out.println("3era puerta");
            case 4 -> System.out.println("4ta puerta");
            case 5 -> System.out.println("5ta puerta");
            case 6 -> System.out.println("6ta puerta");
            case 7 -> System.out.println("7ma puerta");
            case 8 -> System.out.println("8va puerta");
            case 9 -> System.out.println("9na puerta");
            case 10 -> System.out.println("10ma puerta");
            default -> System.out.println("Esta no es una puerta");
        }*/

        /**BÚCLES**/
        /*BÚCLE WHILE*/
        //Bucle que se va a ejecutar "mientras" una condición resulte como true
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Por favor ingresa un número del 1 al 10");
        //Integer numEscogido = scanner.nextInt();

        /*
        while (numEscogido <= 10) {
            System.out.println("En la " + numEscogido + " vuelta el número es: " + numEscogido);
            numEscogido++;
        }*/

        /*BÚCLE DO WHILE*/
        //Búcle que se ejecuta por lo menos una vez
        Integer opcion = 0;

        do {
            System.out.println("Seleccione una opción: 1- Entrar al promedio de notas y 2-El cuadro de honor");
            opcion = scanner.nextInt();
        } while (opcion != 3);

        /*BÚCLE FOR*/


        /*******/

        //EJERCICIO
        /*
        *****Programa para ingresar notas de estudiantes******
        - Crear un menú para ingresar al programa
        - Pedir 3 notas al estudiante
                - Obtener el promedio
        - Según el resultado, imprimir:
        - Si obtuvo menos de 5 pts:  "Reprueba"
                - Si obtuvo 5 pts: "Aprobaste, pero debes seguir estudiando"
                - Si obtuvo más de 7: "Felicidades, sigue así"

         */



    }

}
