public class Ambulacia extends UnidadEmergencia {
    private GPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulacia (String nombre, String nombreOperador){
        super(nombre);
        this.gps = new GPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder (){
        System.out.println("Ambulancia en camino al hospital más cercano.");
    }

    public void iniciarOperacion (){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }
}
