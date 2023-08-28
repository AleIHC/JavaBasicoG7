package C724082023;

import java.util.Scanner;

public class EjercicioCalculadora {

    public static void main(String[] args) {

       imprimirMenu(0);
    }

    //función sin retorno
    public static void imprimirMenu(Integer opcion) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hola bienvenido a la calculadora, por favor, ingresa una opción");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Elegiste la suma");
                System.out.println("Indica el número 1");
                int num1 = scanner.nextInt();
                System.out.println("Indica el número 2");
                int num2 = scanner.nextInt();
                Integer resultado = suma(num1, num2);
                System.out.println(resultado);
            } else if (opcion == 2) {
                System.out.println("Elegiste la resta");
                System.out.println("Indica el número 1");
                int num1 = scanner.nextInt();
                System.out.println("Indica el número 2");
                int num2 = scanner.nextInt();
                Integer resultado = resta(num1, num2);
                System.out.println(resultado);
            } else {
                System.out.println("No es una opción, indica 0 si quieres salir");
            }
        } while (opcion != 0);
    }

    //funciones con retorno
    public static Integer suma(int num1, int num2) {
        return num1 + num2;
    }

    public static Integer resta(int num1, int num2) {
        return num1 - num2;
    }


}
