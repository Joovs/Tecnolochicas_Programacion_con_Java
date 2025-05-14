import java.sql.SQLOutput;

public class Main {
    public static void main(String[]args) {
        //Factura con RFC
        Factura facturaRFC = new Factura(500, "Servicios dentales", "EOGJ124578D");

        //Facura sin RFC
        Factura facturaSinRFC = new Factura(800, "Servicios médicos", null);

        //Mostrar facturas
        System.out.println(facturaRFC.getResumen());
        System.out.println((facturaSinRFC.getResumen()));
    }
}
