public class Pasajero {

    //atributos
    protected String nombre;
    protected String pasaporte;

    //constructor
    public Pasajero (String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    //métodos
    String getNombre(){
        return nombre;
    }

    String getPasaporte(){
        return pasaporte;
    }
}
