public class Tema implements Comparable<Tema> {
    //atributos
    String titulo;
    int prioridad;

    //constructor
    public Tema (String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // sobreescribir método de comparable
    @Override
    public int compareTo (Tema otro){
        return this.titulo.compareTo(otro.titulo);
    }

    //sobreescribir método toString
    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }

}
