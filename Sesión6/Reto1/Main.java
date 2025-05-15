import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main (String[]args){

        //Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        //Paso 2: HashSet para filtrar especies únicas
        HashSet<String> muestrasUnicas = new HashSet<>(muestras);

        //Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestrasInvestigadoras = new HashMap<>();
        muestrasInvestigadoras.put("M-001", "Dra. López");
        muestrasInvestigadoras.put("M-002", "Dra. Hernández");
        muestrasInvestigadoras.put("M-003", "Dra. Escobar");

        //Paso 4: Mostrar resultados
        System.out.println("📋 Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        System.out.println("\n✅ Especies únicas procesadas:");
        for (String especie : muestrasUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\n👩‍🔬 Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigadoras.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        String idBuscar = "M-002";
        System.out.println("\n🔍 Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigadoras.get(idBuscar));
    }
}
