
public class FunctInterApp {


    //    Metodo operar en mi clase concreta.
    public double operar(double x, double y) {
/**
 *   Invoco la interfaz pasando una Expresion Lambda
 *  implemento el metodo calcular de la interfaz Operacion.
 */
        Operacion op = (n1, n2) ->  n1 +  n2;
        return op.calcular(x, y);
    }


    /**
     * Metodo Main
     */
    public static void main(String[] args) {

        FunctInterApp app = new FunctInterApp();

        double rta = app.operar(5, 5);
        System.out.println(rta);
    }

}
