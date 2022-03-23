
public class Scope {

    private static double atributo1;
    private double atributo2;

    /******************************************************/

    public double pruebaVariableLocal() {

        /**
         * Para utilizar la variable local n3, dentro de
         * un metodo anonimo, debe ser designada como FINAL, ya que su valor no podra ser
         * modificado.
         */
        final double n3 = 3;

//        Implementando la interfaz.
        Operacion operacion = new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };
        return operacion.calcularPromedio(3, 3);
    }

    public double pruebaVarLocal() {

        double n3 = 3;  // Al ser una variable local java la hace automaticamente FINAL.

//      Usando la expresion Lambda.
        Operacion op = (x, y) -> {
            return n3 + x + y;
        };
//        Operacion op = (x, y) -> n3 + x + y;
        return op.calcularPromedio(3, 3);

    }

    /**
     * Nota: Tanto en una funcion anonima como en una Lambda el scope para una variable local
     *      siempre sera final. (No se podra modificar).
     */


    /******************************************************/

    public double pruebaVarStaticGlobalanonimo() {

        Operacion op = new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                atributo1 = n1 + n2;
                atributo2 = atributo1;
                return atributo2;
            }
        };
        return op.calcularPromedio(3, 3);
    }

    public double pruebaVarStaticGlobal() {

        Operacion op = (x, y) -> {
            atributo1 = x + y;  //Puedo alterar el valor de un atributo static global de mi clase.
            atributo2 = atributo1; // De la misma manera para un atributo no static global
            return atributo2;
        };

        return op.calcularPromedio(3, 3);
    }

    /**
     * Nota: Las variables Globales sean static o no, tienen el mismo comportamiento
     *      dentro de una expresion Lambda como en un Objeto anonimo que se instancia
     *      a traves de una interfaz donde tenemos que implementar los metodos.
     *  Su comportamiento es el mismo en ambos casos.
     */

    /******************************************************/

    /**
     * Method Main
     */
    public static void main(String[] args) {

        Scope sc = new Scope();
        System.out.println(sc.pruebaVariableLocal());
        System.out.println(sc.pruebaVarLocal());

        System.out.println(sc.pruebaVarStaticGlobal());
        System.out.println(sc.pruebaVarStaticGlobalanonimo());

    }

}
