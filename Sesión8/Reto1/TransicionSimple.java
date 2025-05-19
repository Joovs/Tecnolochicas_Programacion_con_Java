import java.util.Objects;

public class TransicionSimple implements TransicionHistoria{

    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")){
            System.out.println("\uD83E\uDED3 El jugador ha decidido descartar el pastel actual y empezar uno nuevo...");
        }else if (Objects.equals(decision, "B")){
            System.out.println("\uD83C\uDF70 El jugador ha decidido intentar arreglar el error del pastel...");
        } else {
            System.out.println("La opción ingresada no existe ");
        }
    }
}
