public class SimuladorFarmacia {

    //atributos
    String nombreMedicamento;
    double precio;
    int cantidad;

    //constructor
    public SimuladorFarmacia (String nombreMedicamento, double precio, int cantidad){
        this.nombreMedicamento = nombreMedicamento;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //métodos
    public void ticket (){
        System.out.println("* MEDICAMENTO: " + nombreMedicamento);
        System.out.println("* CANTIDAD: " + cantidad);
        System.out.println("* PRECIO UNITARIO: " + precio);
        double total = precio * cantidad;
        System.out.println("** TOTAL SIN DESCUENTO: " + total + " **");
        var aplicaDesc = total > 500;
        System.out.println("* Aplica Descuento: " + aplicaDesc);
        double descuento = (aplicaDesc) ? total * 0.15 : 0;
        System.out.println("* DESCUENTO: " + descuento);
        double montoTotal = total - descuento;
        System.out.println("** TOTAL A PAGAR: " + montoTotal + " **");
    }
}
