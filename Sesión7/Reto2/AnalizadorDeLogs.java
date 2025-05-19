import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main (String[]args){

        //definir rita del archivo
        Path ruta = Paths.get("errores.log");
        Path rutaFallos = Paths.get("registro_fallos.txt");
        Path rutaIncorrecta = Paths.get("errores_incorrectos.log");

        //variables globales
        int totalLineasLeidas= 0;
        int cantidadErrores=0;
        int catidadAdvertencias=0;
        double porcentajeErrores=0;
        double porcentajeAdvertencias=0;

        //leer archivo y contar errores y advertencias
        //try(BufferedReader lector = Files.newBufferedReader(rutaIncorrecta)){
        try(BufferedReader lector = Files.newBufferedReader(ruta)){
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineasLeidas++;
                if (linea.contains("ERROR")) {
                    cantidadErrores++;
                }
                if (linea.contains("WARNING")) {
                    catidadAdvertencias++;
                }
            }

            //calcular porcentajes
            porcentajeErrores = (totalLineasLeidas > 0) ? ((double) cantidadErrores / totalLineasLeidas) * 100 : 0;
            porcentajeAdvertencias = (totalLineasLeidas > 0) ? ((double) catidadAdvertencias / totalLineasLeidas) * 100 : 0;

            //mostrar resumen
            System.out.println("📊 RESUMEN DEL ARCHIVO:");
            System.out.println("- Total de líneas leídas: " + totalLineasLeidas);
            System.out.println("- Total de errores (ERROR): " + cantidadErrores);
            System.out.println("- Total de advertencias (WARNING): " + catidadAdvertencias);
            System.out.println("* Porcentaje de lineas con errores: "+porcentajeErrores);
            System.out.println("* Porcentaje de lineas con advertencias: "+porcentajeAdvertencias);

        }catch (IOException e){
            System.out.println("Error en la siguiente ruta: "+ e.getMessage());

            try (BufferedWriter escritor = Files.newBufferedWriter(rutaFallos)) {
                escritor.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("No fue posible escribir en el archivo de registro de fallos.");
            }
        }
    }
}
