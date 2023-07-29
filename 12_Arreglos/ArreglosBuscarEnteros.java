
import java.util.Scanner;

public class ArreglosBuscarEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] candidates = new int[10];
        int missing = -1, found = 0;

        System.out.println("HUNTING INTs\n");

        System.out.println("Ingresa " + candidates.length + " números");
        for(int i = 0; i < candidates.length; i++) {
            System.out.print(" #" + (i + 1) + ": ");
            candidates[i] = scanner.nextInt();
        }
        System.out.println("");

        System.out.println("¿Qué número tratamos de encontrar?");
        System.out.print("Buscado: ");
        missing = scanner.nextInt();
        System.out.println("");

        for(int elem: candidates) {
            found++;
            if(elem == missing) {
                System.out.println("¡Número encontrado en la posición " + found + "! ");
                System.exit(0);
            }
        }

        System.out.println("Ese número no se encuentra en los datos ingresados...");

        scanner.close();
    }
}
