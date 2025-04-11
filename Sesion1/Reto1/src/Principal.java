import java.util.Scanner;

public class Principal {

    public static void main (String[] args){
        // crear objeto de la clase Scanner
        Scanner myObj = new Scanner(System.in);

        //crear objeto de clase Paciente
        Paciente paciente1 = new Paciente();


        //asignar valores del usaurio al objeto
        System.out.println("Ingresa tu nombre: ");
        paciente1.nombre = myObj.nextLine();

        System.out.println("Ingresa tu edad: ");
        paciente1.edad = Integer.parseInt(myObj.nextLine());
        /* se puede ingresar un entero de esta manera, o en lugar de poner nextLine
        * poner nextInt, pero al usar esto, los datos se guardan en una parte de la
        * memoria llamada buffer (o algo asi), y no borra el valor anterior automáticamente
        * por lo que no se puede usar bien al pedir el siguiente dato, para resolver eso,
        * se pone otra vez el uso de nextLine abajo para que lo borre y después usarlo.
        *
        * ejemplo
        *
        System.out.println("Ingresa tu edad: ");
        paciente1.edad = myObj.nextInt();
        nextInt();          esta linea borra la memoria del buffer
        *
        System.out.println("Ingresa tu número de expediente: ");
        paciente1.numExpediente = myObj.nextInt();

        */

        System.out.println("Ingresa tu número de expediente: ");
        paciente1.numExpediente = Integer.parseInt(myObj.nextLine());

        //es muy recomendable que al usar bibliotecas de entrada y salida, se cierre
        //el objeto que hace posible los inputs, la siguiente línea muestra cómo, esto
        // se recomienda para evitar problemas de memoria
        myObj.close();

        paciente1.mostrarInformacion();

    }
}
