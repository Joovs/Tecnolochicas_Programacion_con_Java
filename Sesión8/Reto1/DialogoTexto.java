public class DialogoTexto implements GestorDialogo{

    public void mostrarDialogo(Narrador paquete) {
        System.out.println("🎙️ Escena actual: " + paquete.getEscenaActual());
        System.out.println("Tu colega te recomienda dos opciones...");
    }
}
