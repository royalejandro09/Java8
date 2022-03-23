import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaApp {

    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("Roy");
        lista.add("Alejandro");
        lista.add("Valderrama");
        lista.add("Martinez");

        /**
         * Usando Lambda ( Enfoque que necesito)
         * parametros, Operador y la expresion.
         * (parametros) -> Expresion
         */
        lista.sort((String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista) {
            System.out.println(elemento);
        }

    }

    public void ordenar1() {
        List<String> lista = new ArrayList<>();
        lista.add("Roy");
        lista.add("Alejandro");
        lista.add("Valderrama");
        lista.add("Martinez");

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }


    public void ordenar2() {
        List<String> lista = new ArrayList<>();
        lista.add("Roy");
        lista.add("Alejandro");
        lista.add("Valderrama");
        lista.add("Martinez");


        lista.sort(Comparator.naturalOrder());

        for (String elemento : lista) {
            System.out.println(elemento);
        }

    }

    public void ordenar3() {
        List<String> lista = new ArrayList<>();
        lista.add("Roy");
        lista.add("Alejandro");
        lista.add("Valderrama");
        lista.add("Martinez");


        List<String> flujo = lista.stream().sorted().collect(Collectors.toList());

        for (String elemento : flujo) {
            System.out.println(elemento);
        }

    }


    public static void main(String[] args) {

        LambdaApp lambda = new LambdaApp();
        lambda.ordenar3();
//        lambda.ordenar2();
//        lambda.ordenar1();
//        lambda.ordenar();


    }

}
