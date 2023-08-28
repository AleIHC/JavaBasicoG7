package C725082023;

import java.util.*;

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



        /*HashSet, funciona muy similar al ArrayList pero no permite duplicados
        HashSet<String> paises = new HashSet<String>();
        System.out.println(paises);

        //For para ingresar datos de manera dinámica al HashSet
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Ingresa a un nuevo país");
            String pais = scanner.nextLine();
            paises.add(pais);
        }

        //Métodos del HashSet
        System.out.println(paises);
        //System.out.println(paises.add("Francia"));
        //System.out.println(paises);
        //paises.remove("Francia");
        //System.out.println("Así quedaría después de remover" + paises );
        //System.out.println(paises.contains("Chile"));

        //Solución Stephania
        String paisSeleccionado = "Chile";
        if (paises.contains(paisSeleccionado)) {
            System.out.println(paisSeleccionado);
        } else {
            System.out.println("No está presente");
        }

        */

        //HashMap, tiene una estructura de llave-valor
        HashMap<String, String> paisesCapitales = new HashMap<>();
        System.out.println(paisesCapitales);

        paisesCapitales.put("Chile", "Santiago");
        paisesCapitales.put("Perú", "Lima");
        paisesCapitales.put("Colombia", "Bogotá");
        paisesCapitales.put("Argentina", "Buenos Aires");
        paisesCapitales.put("Jamaica", "Kingston");
        System.out.println(paisesCapitales);
        paisesCapitales.put("Chile", "RM");
        System.out.println(paisesCapitales);
        System.out.println(paisesCapitales.get("Argentina"));

        //ForEach, es otra sintaxis que permite iterar sobre colecciones
        //La sintaxis se compone del nombre de la variable en cada iteración, separado por : y luego el nombre del HashMap
        //KeySet() permite obtener la llave
        for (String pais : paisesCapitales.keySet()) {
            System.out.println("El país es: " + pais);
            System.out.println("El valor sería: " + paisesCapitales.get(pais));
        }


    }

}
