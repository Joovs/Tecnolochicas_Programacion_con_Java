public class Principal {
    public static void main (String[] args){

        // CREAR OBJETOS
        Entrada obj1 = new Entrada("Concierto", 300);
        Entrada obj2 = new Entrada("Callejoneada", 160);
        // CREAR OBJETOS CON RECORD
        Entrada_Record obj3 = new Entrada_Record("Obra de teatro", 150);
        Entrada_Record obj4 = new Entrada_Record("Función de cine", 50);

        // MÉTODOS PARA MOSTRAR INFORMACIÓN
        obj1.mostrarInformacion();
        obj2.mostrarInformacion();

        obj3.mostrarInformacion();
        obj4.mostrarInformacion();
    }
}
