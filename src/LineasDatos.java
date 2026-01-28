import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineasDatos {
    public static void main(String[] args) {
        int contarL = 0;
        int contarP = 0;
        int contarC = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                contarL++;
                contarC += linea.length();

                if (!linea.trim().isEmpty()) {
                   String[] palabras = linea.trim().split(" ");
                   contarP += palabras.length;
                }
            }

            System.out.println("\nNúmero de líneas: " + contarL);
            System.out.println("Número de caracteres: " + contarC);
            System.out.println("Número de palabras: " + contarP);

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
