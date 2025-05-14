public class Factura {
    //atributos
    String folio;
    String cliente;
    double total;

    //constructor
    public Factura (String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //método toString
    @Override
    public String toString(){
        return "\uD83E\uDDFE Factura [folio= "+folio+", cliente= "+cliente+", total=$"+total+"]";
    }

    //método equals
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }

    //método hashCode
    @Override
    public int hashCode() {
        return folio.hashCode();
    }

}
