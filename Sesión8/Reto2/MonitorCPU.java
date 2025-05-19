import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;

public class MonitorCPU {
    public static void main (String[]args){

        //creación de objetos
        ArrayList<Integer> array = new ArrayList<>();
        HashSet<Integer> consumoServidores = new HashSet<>();

        //Inserción de datos a un arreglo simulando los datos ingresados por el usuario
        array.add(50);
        array.add(90);
        array.add(-1);
        array.add(110);
        array.add(72);
        array.add(66);
        //array.add(96);
        array.add(50);

        //mostrar arreglo
        System.out.println("Datos ingresados por el usuario; "+array+"\n");

        try {
            System.out.println("Eliminando datos fuera de rango");
            for (int i = array.size() - 1; i >= 0; i--) {
                if (array.get(i)<0 || array.get(i)>100){
                    array.remove(i);
                }
                if (array.get(i) > 95) {
                    throw new ConsumoCriticoException("🚨 ALERTA: Consumo crítico detectado (" + array.get(i) + "%)");
                }
            }
            System.out.println("Datos: "+array+"\n");
            System.out.println("Eliminando datos duplicados...");
            consumoServidores.addAll(array);
            System.out.println("Datos sin repetidos: "+consumoServidores);








        }catch (InputMismatchException e) {
            System.out.println("❌ Error: Debes ingresar un número entero válido.");
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("📦 Recursos cerrados correctamente.");
        }



    }
}
