import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main (String[]args){

        //creación de objeto Path, apuntando a un txt
        Path ruta = Paths.get("config/");
        Path archivo = ruta.resolve("parametros.txt");
        

        //String con contenido para el txt
        String contenido = "\n" +
                "    Tiempo de ciclo: 55.8 segundos\n" +
                "    Velocidad de línea: 1.2 m/s\n" +
                "    Número de estaciones: 8\n";

        //guardar contenido en archivo txt
        try{
            //validar si la carpeta 'config' existe y si no, crearla
            if(!Files.exists(ruta)) {
                Files.createDirectory(ruta);
                System.out.println("Se creó la carpeta 'config'");
            }

            //guardar contenido en el archivo
            Files.write(archivo, contenido.getBytes());
            System.out.println("Se guardó el contenido en el archivo");

            if (Files.exists(archivo)) {
                System.out.println("El archivo fue creado correctamente");
                System.out.println(Files.readString(archivo));
            }else {
                System.out.println("Ocurrió un error al crear el archivo");
            }
        }catch (IOException e){
            System.out.println("Ocurrió un error: "+ e.getMessage());
        }

    }
}
