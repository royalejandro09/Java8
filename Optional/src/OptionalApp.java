import jdk.swing.interop.SwingInterOpUtils;

import java.util.Optional;

public class OptionalApp {

    /**
     * Forma basica de controlar nuestros NullPointerException
     */

    public void probar(String valor) {
        /*System.out.println(valor.contains("Pedro"));*/

//        Instanciando la funcionalidad Optional (Objeto Optional vacio).
        /*Optional<String> op = Optional.empty();*/
        try {
            Optional op = Optional.empty();
            op.get();
        } catch (Exception e) {
            System.out.println("No hay elemento");
        }
    }

    /*********************************************************/
    public void orElse(String valor) {
//        Si nuestro valor acepta Null utilizamos el ofNullable()
        Optional<String> op = Optional.ofNullable(valor);
//      Con el orElse podemos devolver un valor por defecto.
        String x = op.orElse("Predeterminado");
        System.out.println(x);
    }

    /*********************************************************/
    public void orElseThrow(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
//        A traves de un metodo de referencia llamamos al constructor de la clase (::)
//        NumberFormatException para lanzar una Excepcion predeterminada.
        /*op.orElseThrow();*/
        op.orElseThrow(NumberFormatException::new);
    }

    /*********************************************************/
    public void isPresent(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
//      si valor es null indica el isPresent que no ha sido inicializado lanza un false
//        Utilizado para saber si un valor ha sido inicializado, retorna un Boolean(True/false).
        System.out.println(op.isPresent());
    }


    /*********************************************************/
    /**
     * Method Main
     */
    public static void main(String[] args) {

//        Instanciando mi clase OptionalApp
        OptionalApp app = new OptionalApp();

//        Usando los metodos
        app.probar("Pablo");

//        app.orElse(null);
        app.orElse("Pablo");

        app.orElseThrow("Pedro");
//        app.orElseThrow(null);

        app.isPresent(null);
        app.isPresent("Leon");
    }
}
