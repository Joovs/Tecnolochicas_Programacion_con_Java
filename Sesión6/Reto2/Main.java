import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main (String[]args){
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        Collections.sort(temas);

        System.out.println("\nTemas ordenados alfabéticamente:");
        for (Tema tema : temas){
            System.out.println(tema);
        }

        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema o1, Tema o2) {
                return Integer.compare(o1.prioridad, o2.prioridad);
            }
        });

        System.out.println("\nTemas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println(t);
        }
    }
}
