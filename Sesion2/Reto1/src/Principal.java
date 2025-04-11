import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ingresa el nombre de tu medicamento: ");
        String nombre = myObj.nextLine();
        System.out.println("Ingresa el precio: ");
        double precio = myObj.nextDouble();
        System.out.println("Ingresa la cantidad deseada: ");
        int cantidad = myObj.nextInt();

        SimuladorFarmacia cuentaCliente = new SimuladorFarmacia(nombre, precio, cantidad);

        cuentaCliente.ticket();

        //crear un objeto

    }
}
