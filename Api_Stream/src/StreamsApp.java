import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamsApp() {
        this.lista = new ArrayList<>();
        this.numeros = new ArrayList<>();

        lista.add("Pedro");
        lista.add("Pablo");
        lista.add("Leon");
        lista.add("Jaramillo");

        numeros.add("1");
        numeros.add("4");
        numeros.add("8");
    }

    /***************************************************************/
    public void filtrar() {
        //Usando el Stream tenemos el metodo filter que recibe un (Predicate)
        //en este caso es nuestra expresion Lambda.
        //Obtenemos de la lista todos lo que empiecen con la letra "J"
        //Con el forEach usamos un metodo de referencia (::).
        lista.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    }

    /***************************************************************/
    public void ordenar() {
        //Ordenando de manera Ascendente
        /*lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted().forEach(x -> System.out.println(x));*/

        //Ordenando de manera descendente.
        lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
    }

    /***************************************************************/
    public void transformar() {
        //Transformamos todos los elementos en mayuscula a traves de la expresion que
        //estamos indicando como parametro en el (map).
        /*lista.stream().map(String::toUpperCase).forEach(System.out::println);*/

        //Transformando la lista de numero de String a Entero y sumarle 1.
        numeros.stream().map(element -> Integer.parseInt(element) + 1).forEach(System.out::println);
    }

    /***************************************************************/
    public void limitar() {
        lista.stream().limit(3).forEach(System.out::println);
    }

    /***************************************************************/
    public void contar() {
        //Retorna un valor de tipo Long.
        long cantidad = lista.stream().count();
        System.out.println(cantidad);
    }


    /***************************************************************/
    /**
     * Method main
     */
    public static void main(String[] args) {

//        Instancia de mi clase StreamsApp
        StreamsApp app = new StreamsApp();


//        Usando el metodo Ordenar.
        app.filtrar();

//        Usando el metodo Ordenar.
        app.ordenar();

//        Usando el metodo Transformar
        app.transformar();

//        Usando el metodo Limitar
        app.limitar();

//        Usando el metodo Contar
        app.contar();

    }
}
