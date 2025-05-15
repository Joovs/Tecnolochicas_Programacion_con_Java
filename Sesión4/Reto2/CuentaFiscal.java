import java.util.Objects;

public class CuentaFiscal {
    final private String rfc;
    private double saldoDisponible;

    //constructor
    public CuentaFiscal (String rfc, double saldo){
        if (saldo >= 0){
            this.saldoDisponible = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo");
            this.saldoDisponible = 0;
        }
        this.rfc = rfc;
    }

    //getters
    public String getRfc (){
        return rfc;
    }

    public double getSaldoDisponible () {
        return saldoDisponible;
    }

    //setters
    public void setSaldoDisponible(double newSaldo){
        this.saldoDisponible = newSaldo;
    }

    //métodos
    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void mostrarCuenta() {
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}
