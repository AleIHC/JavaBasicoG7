package C728082023;

public class Chocolate {

    //Atributos o características del chocolate
    String tamaño;
    String color;
    String sabor;
    String forma;
    Integer porcentajeCacao;

    //Constructores
    public Chocolate() {
    }

    public Chocolate(String tamaño, String color, String sabor, String forma, Integer porcentajeCacao) {
        this.tamaño = tamaño;
        this.color = color;
        this.sabor = sabor;
        this.forma = forma;
        this.porcentajeCacao = porcentajeCacao;
    }

    //ToString, es para trabajar con la consola
    @Override
    public String toString() {
        return "" +
                "tamaño='" + tamaño + '\'' +
                ", color='" + color + '\'' +
                ", sabor='" + sabor + '\'' +
                ", forma='" + forma + '\'' +
                ", porcentajeCacao=" + porcentajeCacao +
                '}';
    }

    //Métodos
    public String derretirse() {
        return "Estoy derretido";
    }

    public String expira() {
        return "Ya expiré";
    }

}
