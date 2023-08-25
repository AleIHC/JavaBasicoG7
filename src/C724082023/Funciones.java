package C724082023;

import java.util.Scanner;

public class Funciones {

    //Modificador de acceso
    //Static es una palabra reservada que indica que no es necesaria una instancia de la clase
    //Void indica que la función no tiene retorno
    public static void main(String[] args) {

        System.out.println("Estas son las funciones");
        /*
        imprimirNombre("Cyberpunk", "Cohorte 7", 7);
        imprimirNombre("Lovelace", "Cohorte 3", 3);
        imprimirNombre("Hamilton", "Cohorte 2", 2);
        */
        //String resultadoFuncion = imprimirNombre("Piloto", "Cohorte 1", 1);
        //System.out.println("El resultado de la suma es " + suma(10, 10));
        //Integer resultadoSuma = suma(20, 20);
        //System.out.println(resultadoSuma);

        /*imprimirPokemon("Pikachu");

        String pokemon = pokemonParaGuardar("Bulbasaur");
        System.out.println(pokemon.toUpperCase());
        System.out.println(pokemon.charAt(3));
        */



    }


    public static String imprimirNombre(String nombre, String apellido, Integer edad) {
        System.out.println("********");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));//charAt es un método de los String que permite ver el carácter en una posición
        }
        return "Tu nombre es " + nombre + ", tu apellido es " + apellido + ", tu edad es " + edad;
    }

    /*************/
    //Funciones de tipo void: No retornan nada
    public static void imprimirPokemon(String nombre) {
        System.out.println("Soy un " + nombre);
    }

    //Funciones de retorno
    public static String pokemonParaGuardar(String nombre) {
        return nombre;
    }
    /**************/



}
