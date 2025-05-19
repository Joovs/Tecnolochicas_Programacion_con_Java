public class MainNarrativa {
    public static void main (String[]args){

        //creación de objetos
        Narrador historia = new Narrador("VIDEOJUEGO DE PASTELES \uD83C\uDF82 \n Te has equivocado en el diseño de un pastel \uD83E\uDEE3");
        DecisionBinaria decision = new DecisionBinaria();
        DialogoTexto dialogo = new DialogoTexto();
        TransicionSimple transicion = new TransicionSimple();

        //uso de objetos
        dialogo.mostrarDialogo(historia);
        transicion.realizarTransicion(decision.tomarDecision());


    }
}
