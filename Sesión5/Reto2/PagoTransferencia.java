public class PagoTransferencia extends MetodoPago implements Autenticable{

    //atributos
    protected boolean validadoExternamente;

    //constructor
    public PagoTransferencia (double monto, boolean validacionExterna){
        super(monto);
        this.validadoExternamente = validacionExterna;
    }

    //métodos
    @Override
    public boolean autenticar (){
        return validadoExternamente;
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando pago por transferencia por $" + monto);
    }

}
