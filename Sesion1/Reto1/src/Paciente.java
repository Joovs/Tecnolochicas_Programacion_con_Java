public class Paciente {
    // ATRIBUTOS
    String nombre;
    int edad;
    int numExpediente;

    // MÉTODOS
    public void mostrarInformacion () {
        System.out.println("PACIENTE: "+ nombre);
        System.out.println("EDAD: "+ edad);
        System.out.println("EXPEDIENTE: "+ numExpediente);
    }
}
