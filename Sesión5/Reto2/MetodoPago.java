public abstract class MetodoPago implements Autenticable{
    //atributos
    protected double monto;

    //constructor
    public MetodoPago (double monto){
        this.monto = monto;
    }

    // metodo abstracto
    abstract void procesarPago();

    // metodos normales
    public void mostrarResumen(){
        System.out.println("TIPO: "+ this.getClass().getSimpleName()+ " - MONTO: " + monto);
    }
}
