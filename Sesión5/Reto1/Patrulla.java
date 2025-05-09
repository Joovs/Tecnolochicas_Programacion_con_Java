public class Patrulla extends UnidadEmergencia {
    private GPS gps;
    private Sirena sirena;
    private Operador operador;

    public Patrulla (String nombre, String nombreOperador){
        super(nombre);
        this.gps = new GPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder (){
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana.");
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
