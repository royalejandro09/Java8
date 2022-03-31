

public class DefaultMethod implements PersonaA, PersonaB {

    @Override
    public void caminar() {
        System.out.println("Hola Mundo");
    }

    /**
     * Implementando el metodo Default ya que las 2 interfaces que implementa mi clase
     * contienen el mismo metodo y no sabe cual debe usar.
     * utiliza la referencia  ->         PersonaA.super.hablar();   o      PersonaB.super.hablar();
     * para elegir el metodo de la interfaz que utilizara.
     */
//    @Override
//    public void hablar(){
//        PersonaB.super.hablar();
//    }

    @Override
    public void hablar() {
        PersonaA.super.hablar();
//        PersonaB.super.hablar();
        System.out.println("Este es mi implementacion adicional a la que tiene" +
                " mi metodo default en la interfaz que estoy implementando");
        /**
         * Puedo agregar mi propia (logica) implementacion sin importar el codigo que venga de
         * la interfaz.
         */
    }


    /**
     * Method Main
     */
    public static void main(String[] args) {
       DefaultMethod app = new DefaultMethod();

       app.caminar();
        app.hablar();
    }
}
