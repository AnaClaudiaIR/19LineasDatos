import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineasDatos {
    public static void main(String[] args) {
        int contarL = 0;
        int contarP = 0;
        int contarC = 0;

        //Leer el archivo con el buffered reader
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea); //Imprimir la linea del archivo
                contarL++; //Sumar a número de líneas
                contarC += linea.length(); //Contar los caracteres

                if (!linea.trim().isEmpty()) {
                   String[] palabras = linea.trim().split(" "); //Por cada espacio, contarlo como una palabra, y sumar 1 al contador
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
