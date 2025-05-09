public class CajaRegistradora {
    public static void main(String[]args){

        MetodoPago[] metodos = {
            new PagoEfectivo(280),
            new PagoTarjeta(300, 500),
            new PagoTransferencia(700, false)
        };

        for (MetodoPago pago : metodos) {
            if(pago.autenticar()){
                System.out.println("✅ ¡Autenticación exitosa!");
                pago.procesarPago();
                pago.mostrarResumen();
                System.out.println();
            }else{
                System.out.println("❌ Fallo de autenticación. "+ pago.getClass().getSimpleName() + " no válido.");
            }
        }
    }
}
