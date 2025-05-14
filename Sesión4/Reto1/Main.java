public class Main {
    public static void main (String[]args){
        // creación de objetos
        Factura object1 = new Factura("F-001", "Alexandra Arenas", 270);
        Factura object2 = new Factura("F-001", "Carina Cortéz", 880);

        //mostrar facturas
        System.out.println(object1);
        System.out.println(object2);

        //comparación de objetos
        System.out.println("¿Las facturas son iguales?: "+ object1.equals(object2));
    }
}
