public class CentralEmergencias {
    public static void main (String[] args){
        // instanciación de objetos
        Ambulacia ambulancia = new Ambulacia("Ambulancia", "Clara Ramírez");
        Patrulla patrulla = new Patrulla("Patrulla", "Aurora Vela");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de Bomberos", "Javiera Mendoza");


        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        bomberos.iniciarOperacion();

    }
}
