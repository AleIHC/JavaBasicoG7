package C722082023;

import java.util.Scanner;

// Java es un lenguaje basado en clases
// Las clases son como un molde o plano que determina el comportamiento del objeto
public class Main {

    //Método main que es el que ejecuta el programa
    public static void main(String[] args) {

        //Método para imprimir en consola, símil del console.log en JS, se puede escribir sout y presionar enter
        System.out.println("Hola cohorte cyberpunk!");

        // -> Comentarios de línea con doble slash
        /*
        -> Este es un comentario de bloque
         */

        //TIPOS DE DATO EN JAVA
        //Tipo primitivo

        /*
        * byte: 8-bit, valor mín: -128 y max: 127
        * short: 16-bit, min: -32768 y max: 32767
        * int: 32-bit, min -2,147,483,648 y el máximo 2,147,483,647
        * long: 64-bit, min: -9,223,372,036,854,775,808 y max: 9,223,372,036,854,775,807
        * float: 32-bit IEEE 754, 6 a 7 dígitos decimales
        * double: 64-bit IEEE 754, 15 dígitos decimales
        * char: 16-bit, es para un caracter, los caractéres se escriben en comillas simples
        * boolean: true/false
        * */

        //Variables de tipo numérico
        byte edad = 31;
        System.out.println("la edad es " + edad);

        short shortUno = -32768;
        System.out.println("El short es " + shortUno);

        int enteroUno = 2147483647;
        System.out.println("El short es " + enteroUno);

        //Castear, es convertir el tipo de dato
        float floatUno = 123.232342F;
        float floatDos = (float) 123.435345;
        System.out.println("Los valores de ambos float son " + floatUno + " y " + floatDos);

        //De mayor a menor sucede de manera automática
        //De menor a mayor

        boolean estaPresente = true;

        if (estaPresente) {
            System.out.println("Hola, bienvenido a la clase");
        } else {
            System.out.println("El estudiante está ausente");
        }

        //Tipo objeto
        /*
        * String
        *
        *
        String nombre = "Cyberpunk";
        String nombreDos = "cyberpunk";

        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println("La longitud es: " + nombre.length());
        System.out.println(nombre.toLowerCase().equals(nombreDos));


         */
        //Parse, permite convertir de String a un dato numérico
        String edadPromedio = "31";
        Integer edadNumero = Integer.parseInt(edadPromedio);
        System.out.println(edadNumero);

        Double edadDecimal = Double.parseDouble(edadPromedio);
        System.out.println(edadDecimal);



        //Como recibir datos del usuario a través de la consola
        //Importamos la clase Scanner de la librería java.util y la inicializamos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre");
        String nombreUsuario = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombreUsuario);
        teclado.close();


        //Ejercicio


    }
}