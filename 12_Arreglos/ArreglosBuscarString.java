
import java.util.Scanner;

public class ArreglosBuscarString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] candidates = new String[10];
        String missing = "";

        System.out.println("HUNTING STRINGs\n");

        System.out.println("Ingresa " + candidates.length + " strings");
        for(int i = 0; i < candidates.length; i++) {
            System.out.print(" #" + (i + 1) + ": ");
            candidates[i] = scanner.next();
        }
        System.out.println("");

        System.out.println("¿Qué cadena tratamos de encontrar?");
        System.out.print("Buscada: ");
        missing = scanner.next();
        System.out.println("");

        int found = 0;
        for(; found < candidates.length && !candidates[found].equalsIgnoreCase(missing); found++){}

        if(found == candidates.length) 
            System.out.println("Esa cadena no se encuentra en los datos ingresados...");
        else
            System.out.println("¡Cadena encontrada en la posición " + (found + 1) + "! ");

        scanner.close();
    }
}
