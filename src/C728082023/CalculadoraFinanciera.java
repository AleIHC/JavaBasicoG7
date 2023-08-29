package C728082023;

import java.util.ArrayList;

public class CalculadoraFinanciera extends Calculadora {

    //Atributos
    boolean permiteGraficar;
    ArrayList<String> formatosPermitidos;

    //Constructores
    public CalculadoraFinanciera() {
    }

    public CalculadoraFinanciera(boolean permiteGraficar, ArrayList<String> formatosPermitidos) {
        this.permiteGraficar = permiteGraficar;
        this.formatosPermitidos = formatosPermitidos;
    }

    //Métodos
    public String linealizar(int num1, int num2) {
        int resultado = (num1 + num2)/2;
        return "El resultado de linealizar es: " + resultado;
    }

    //
}
