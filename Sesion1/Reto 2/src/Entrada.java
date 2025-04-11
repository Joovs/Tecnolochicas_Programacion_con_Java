
public class Entrada {

    // ATRIBUTOS
    String nombreEvento;
    double precioEntrada;

    // CONSTRUCTOR
    public Entrada( String nombreEvento, double precioEntrada){
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    //MÉTODOS
    public void mostrarInformacion(){
        System.out.println("EVENTO: " + nombreEvento + " | PRECIO: $" + precioEntrada);
    }
}
