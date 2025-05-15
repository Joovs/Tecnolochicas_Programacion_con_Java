public class Main {
    public static void main (String[]args){

        //creación de objetos
        CuentaFiscal cuenta = new CuentaFiscal("ASDF1234", 152.50);
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ASDF1234", 117.0);

        //mostrar información
        System.out.println("\uD83D\uDCC4 Declaración enviada por RFC: "+ declaracion.rfcContribuyente() + "por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        System.out.println("✅ ¿RFC válido para esta cuenta?: " + cuenta.validarRFC(declaracion));
    }
}
