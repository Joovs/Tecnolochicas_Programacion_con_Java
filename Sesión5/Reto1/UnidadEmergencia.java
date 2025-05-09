public abstract class UnidadEmergencia {
    // atributos
    String nombre;

    // constructor
    public UnidadEmergencia (String nombre){
        this.nombre = nombre;
    }

    //métodos
    public void activarUnidad (){
        System.out.println("ACTIVANDO UNIDAD: " + nombre);
    }

    //método abstracto
    public abstract void responder();
}
