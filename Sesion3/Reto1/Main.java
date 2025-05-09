public class Main {
    public static void main (String[]args){
        //creación de objetos
        Pasajero pasajero = new Pasajero("Ramona", "PAS124578");
        Vuelo vuelo = new Vuelo("CV122345", "Baja Clifornia", "20:00 horas");

        //reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado){
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        //mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //cancelar reserva
        System.out.println("**Cancelando reserva...**\n");

        //mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizar una nueva reservación
        vuelo.reservarAsiento("Mariana González", "PAS895623");
        System.out.println(vuelo.obtenerItinerario());
    }
}
