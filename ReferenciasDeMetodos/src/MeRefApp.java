import java.util.Arrays;

public class MeRefApp {

    /*****************************************************************/
    /**
     * referencia a metodo estatico.
     */
    public static void referenciaMetodoStatic() {
        System.out.println("Metodo Referido static");
    }

    /*****************************************************************/

    /**
     * Metodo referencia instancia Objeto arbitrario/clase en particular.
     */
    public void referenciaMetodoInstanciaObjetoArbitrario() {
        String[] names = {"Pedro", "Pablo", "Jaramillo"};

//         Clase (Arrays) con el metodo (Sort) y usando la Interface Comparator<>
        /*Arrays.sort(names, new Comparator<String>() {
            //Sobreescribe el metodo de la Interface Compare.
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/

//        Usando Expresion lambda para reducir el codigo y que no sea tan verboso.
        /*Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(names));*/

//    Usando el operador referencias al metodo (::).
        // String indica la clase que quiero Comparar y utilizamos un metodo
        // del objeto que quiero comparar (names) ya que es de tipo (Array String)
        // en este caso el metodo (compareToIgnoreCase)
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }


    /*****************************************************************/
    /**
     * Metodo referencia instancia objeto particular.
     */
    public void referenciaMetodoInstanciaObjetoParticular() {
        System.out.println("Metodo Referido Instancia de objeto en particular");

    }

    /*****************************************************************/
    /**
     * Metodo referencia a constructor.
     */
    public void referenciaConstructor() {
//        Implementando el metodo crear de la Interfaz IPersona.
        /*IPersona iper = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        iper.crear(1, "Pedro");*/

//        Usando e¿Expresion Lambda
        /*IPersona iper2 = (id, nombre) -> (new Persona(id, nombre));
        Persona per = iper2.crear(1, "Pedro");
        System.out.println(per);*/

//        Usando los metodos a Referencia (::).
        IPersona iper3 = Persona::new;
        Persona per = iper3.crear(1, "Pedro");
        System.out.println(per);
    }


    /*****************************************************************/
    /**
     * Metodo Operar
     */
    public void operar() {

//        Implementacion de la interfaz Operacion por medio de una expresion Lambda
       /* Operacion op = () -> MeRefApp.referenciaMetodoStatic();
        op.saludar();*/

//        Sustitucion de la Expresion Lambda por una referencia a un metodo con el operador [::]
//        En estos metodos referenciados no podemos enviarle Parametros (Para Java 8).
        Operacion op2 = MeRefApp::referenciaMetodoStatic;
        op2.saludar();
    }


    /*****************************************************************/
    /**
     * Method Main
     */
    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();

//       Ejecucion del metodo operar de mi clase MeRefApp.class.
        //app.operar();

//        Ejecutando el metodo referenciaMetodoInstanciaObjetoArbitrario
        //app.referenciaMetodoInstanciaObjetoArbitrario();

//        Referenciando un metodo de Instancia de un objeto en particular.
//        Implementando el metodo Saludar de mi Interface Operar.
        //Operacion op = app::referenciaMetodoInstanciaObjetoParticular;
        //op.saludar();

//        Ejecutando el metodo referneciConstructor.
        app.referenciaConstructor();
    }
}
