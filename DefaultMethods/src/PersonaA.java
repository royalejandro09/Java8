public interface PersonaA {

    public void caminar();

    /**
     * Metodo por default
     * Aqui podemos crear un metodo por default que todas las clases que
     * implementen la interfaz tengan acceso a el con toda su logica implementada.
     */
    default public void hablar(){
        System.out.println("Hello World A");
    }
}
