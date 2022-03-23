
public class Calcular {


    public double calcular() {
/**
 * Sin usar Expresion lambda hago una funcion/metodo anonimo de una Interfaz.
 * Instancio la Interfaz ( No puede ser instanciada)
 */
        Operacion operacion = new Operacion() {
            // Se implementa Automaticamente el metodo de la interfaz.
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };
// Ejecutamos llamando a la instancia/anonima de la interfaz.
        return operacion.calcularPromedio(2, 3);
    }


    public double calcular1() {
        /**
         * Usando la Expresion Lambda e implementando el metodo de la interfaz.
         * Utilizamos {} cuando queremos definir mas de una linea de codigo.
         */
        Operacion op = (double x, double y) -> {
            double a =1;
            System.out.println(a);
            return  (x + y + a) / 2;
        };
        return op.calcularPromedio(2, 3);

    }

    public double calcular2() {
//Una forma de implementar la interfaz sin instanciarla.

//        Operacion op = (double x, double y) -> (x + y) / 2;

        Operacion op = ( x,  y) -> (x + y) / 2; //(la interfaz me reconoce el tipo de dato definido en mis parametros sin declararselo).
        return op.calcularPromedio(2, 3);
    }



    public static void main(String[] args) {

        Calcular calculo = new Calcular();
        System.out.println(calculo.calcular1());
//        System.out.println(calculo.calcular2());
//        System.out.println(calculo.calcular());
    }

}
