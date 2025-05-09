public class Vuelo {

    //atributos
    final private String codigoVuelo; //
    private String destino; //ciudad destino del vuelo 🗺️
    private String horaSalida; // hora de salida en formato 24h ⏰
    private Pasajero asientoReservado;

    //constructor
    public Vuelo (String codigo, String destino, String horaSalida){
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //métodos
    public boolean reservarAsiento (Pasajero p){
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    public void cancelarReserva(){
        asientoReservado = null;
    }

    public String obtenerItinerario(){
        String info = "✈\uFE0F Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: "+ destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null){
            info += "Pasajero: "+ asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }

}
