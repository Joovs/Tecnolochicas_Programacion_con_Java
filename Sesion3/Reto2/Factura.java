import java.util.Optional;

public class Factura {
    //atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //constructor
    public Factura (double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // metodo para devolver una factura
    public String getResumen () {
        String resumen = "FACTURA GENERADA: \n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        //si el RFC no es null, se muestra, si es null muestra un mensaje alternativo
        resumen += "RFC: " + rfc.orElse("[No se proporcionó]" + "\n");

        return resumen;
    }

}
