import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision{

    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer? Ingresa la opción que quieres: ");
        System.out.println("A) Tirar el pastel y hacer uno nuevo");
        System.out.println("B) Intentar corregir el error de este pastel");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}
