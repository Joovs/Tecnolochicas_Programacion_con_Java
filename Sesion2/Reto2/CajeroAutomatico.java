import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.00;
        int opcion;

        System.out.println("Bienvenido al cajero automático");

        do {
            System.out.println("      1. Consultar saldo\n" +
                    "      2. Depositar dinero\n" +
                    "      3. Retirar dinero\n" +
                    "      4. Salir\n"+
                    "Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.println("Tu saldo actual es: "+ saldo);
                }
                case 2 -> {
                    System.out.println("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0){
                        System.out.println("El depósito debe ser mayor a 0");
                        continue;
                    }

                    saldo += deposito;
                    System.out.println("Depósito exitoso, tu saldo actual ahora es: $" + saldo);
                }
                case 3 -> {
                    System.out.println("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0){
                        System.out.println("El retiro debe ser mayor a 0");
                        continue;
                    }

                    saldo -= retiro;
                    System.out.println("Retiro exitoso, tu saldo actual ahora es: $" + saldo);
                }

                case  4 -> {
                    System.out.println("Gracias por tu preferencia, hasta luego;)");
                }

                default -> {
                    System.out.println("Intenta ingresar una opción válida");
                }
            }
        }
        while (opcion != 4);

        scanner .close();
    }
}
