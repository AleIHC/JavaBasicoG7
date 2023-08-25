package C725082023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        //Sintaxis para crear un nuevo arreglo
        //La clase ArrayList con el tipo de dato, luego el nombre de la variable
        //Para inicializarla creamos la nueva instancia

        //Arreglo fijo
        int[] numeros = {1, 2, 4, 5, 7, 8};
        System.out.println(Arrays.toString(numeros));
        //Imprimiendo indicando el índice
        System.out.println(numeros[3]);


        //Arreglos dinámicos
        ArrayList<String> estudiantesCyberpunk = new ArrayList<>();
        //Agregar al ArrayList
        /*
        estudiantesCyberpunk.add("Angel");
        estudiantesCyberpunk.add("Matías");
        estudiantesCyberpunk.add("Lizette");
        */

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Ingresa a un nuevo estudiante");
            String estudiante = scanner.nextLine();
            estudiantesCyberpunk.add(estudiante);
        }

        System.out.println(estudiantesCyberpunk);
        //Método size funciona como la propiedad length
        System.out.println(estudiantesCyberpunk.size());
        //Remover del arraylist
        String estudianteExpulsado = estudiantesCyberpunk.remove(((estudiantesCyberpunk.size() - 2 )));
        System.out.println(estudianteExpulsado);
        //El set permite cambiar el valor que esté alojado en un índice
        estudiantesCyberpunk.set(0, "Alba");
        System.out.println(estudiantesCyberpunk);
        //El índice en Java también parte desde 0
        System.out.println("El estudiante en la tercera posición es: " + estudiantesCyberpunk.get(2));

        //HashSet, funciona muy similar al ArrayList pero no permite duplicados
        //HashMap, tiene par llave-valor


    }

}
