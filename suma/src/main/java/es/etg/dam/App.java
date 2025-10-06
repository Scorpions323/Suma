package es.etg.dam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static final String MSG_ERROR = "Se ha producido un error al ejecutar el comando";
    public static final String[] COMANDOS = { "java", "-cp", "/home/debian/SUMA/suma/target/classes", "es.etg.dam.Suma", "2", "4" };
    
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec(COMANDOS);
            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitVal = process.waitFor();

            if (exitVal == 0) {
                System.out.println("El Resultado es: " + output);
                System.exit(0);
            } else {
                System.out.println(MSG_ERROR);
                System.exit(1);
            }

        } catch (IOException | InterruptedException e) {
            System.exit(34);
        }
    }
}