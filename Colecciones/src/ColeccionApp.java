import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

    private List<String> lista;

    /***********************************************************/
//    Agregando datos a nuestra lista.
    public void llenarLista() {
        lista = new ArrayList<>();

        lista.add("Pedro");
        lista.add("Pablo");
        lista.add("Leon");
    }

    /***********************************************************/
    public void usandoForEach() {
       /* for (String element : lista) {
            System.out.println(element);
        }*/

//        Usando el metodo ForEach de Java 8.
        //Este metodo solicita un (Consumer<T>) el cual es una interfaz Funcional
        // que tiene un unico metodo llamado (accept) y este metodo recibira una
        // logica que nosotros implementemos en una expresion lambda o un metodo de referencia.
        /*lista.forEach(element -> System.out.println(element));*/

//        Usando Referencias a Metodos (::).
        lista.forEach(System.out::println);

    }

    /***********************************************************/
//    Quita un elemento cuando exista una logica que realicemos.
    public void usandoRemoveIf() {
        //Cuando estamos en un ciclo For no podemos eliminar porque nos arroja
        //una Excepcion llamada (ConcurrentException).
        /*for (String element : lista) {
            if (element.equalsIgnoreCase("Pedro")){
                lista.remove(element);
            }*/

//        Para solucionar la anterior Exception generada al eliminar dentro del ciclo For.
        /*Iterator<String> element = lista.iterator();
        while (element.hasNext()) {
            if (element.next().equalsIgnoreCase("Pedro")) {
                element.remove();
            }
        }*/

//     Reduciendo Codigo usando el PARADIGMA FUNCIONAL.
        //Aqui tenemos la clase Predicate usada para armar predicados por ejemplo:
        //Instrucciones que representan una logica como eliminacion, agregacion, condicionales.
        lista.removeIf(element -> element.equalsIgnoreCase("Pedro"));

    }

    /***********************************************************/
    public void usandoSort() {
//        Si el elemento era un objeto para ordenarlo usabamos el (Comparator).
        /*Collections.sort(lista);*/

//        Apoyandonos en el metodo SORT de la propia Lista, con expresion Lambda.
        lista.sort((elementX, elementY) -> elementX.compareTo(elementY));


    }

    /***********************************************************/
    /**
     * Method Main
     */
    public static void main(String[] args) {
//Instancia de nuestra clase.
        ColeccionApp app = new ColeccionApp();

//        Ejecutando el metodo para agregar elementos a la lista
        app.llenarLista();

//        Ejecutando el metodo usandoForEach.
        //app.usandoForEach();

//        Ejecutando el metodo usandoRemoveIf.
        //app.usandoRemoveIf();
        //app.usandoForEach(); //Comprobando la eliminacion del elemento.

//            Ejecutando el metodo usandoSort.
        app.usandoSort();
        app.usandoForEach();//mostrando en orden la lista.
    }

}

