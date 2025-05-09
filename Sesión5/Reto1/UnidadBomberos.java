public class UnidadBomberos extends UnidadEmergencia {
    private GPS gps;
    private Sirena sirena;
    private Operador operador;

    public UnidadBomberos (String nombre, String nombreOperador){
        super(nombre);
        this.gps = new GPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder (){
        System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
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
