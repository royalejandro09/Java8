

@FunctionalInterface //Indica que La interfaz que esta debajo de la anotacion
                                // debe ser una interfaz Funcional.
public interface Operacion {


    /**
     * Para que una Interfaz sea funcional:
     * es aquella solamente define un unico metodo,
     * al intentar usar mas de un metodo me muestra un error.
     */
    double calcular(double n1, double n2);

    /**
     * Descomentar para ver el error.
     */
//    int calcular2();

}
