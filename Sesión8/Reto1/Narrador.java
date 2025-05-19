public class Narrador {
    //atributos
    private String escenaActual;

    //constructor
    public Narrador (String escenaActual) {
        this.escenaActual = escenaActual;
    }

    //getters y setters
    public String getEscenaActual() {
        return escenaActual;
    }

    public void setEscenaActual(String nuevaEscena) {
        this.escenaActual = nuevaEscena;
    }

}
