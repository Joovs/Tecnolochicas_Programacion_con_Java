public class Operador {

    //atributos
    String nombre;

    //constructor
    public Operador(String nombre) {
        this.nombre = nombre;
    }

    //métodos
    public void reportarse (){
        System.out.println("\uD83D\uDC72 Operador@ " + nombre + " reportándose.");
    }
}
