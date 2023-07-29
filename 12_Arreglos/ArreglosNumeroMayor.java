
import java.util.Scanner;

public class ArreglosNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, max = 0;

        System.out.println("IDENTIFICANDO EL MAYOR\n");

        System.out.print("¿Cuántos números deseas ingresar?\nCantidad: ");
        n = scanner.nextInt();

        if(n < 1) {
            System.out.println("\nAsí no hay en dónde buscar sabess :(");
            System.exit(0);
        }

        int[] nums = new int[n];
        System.out.println("\n¡De acuerdo!");

        for(int i = 0; i < n; i++) {
            System.out.print("Número " + (i+1) + ": ");
            nums[i] = scanner.nextInt();

            max = (nums[i] > nums[max])?i:max;
        }

        System.out.println("\n#" + (max+1) + " es el mayor y vale " + nums[max]);

        scanner.close();
    }
}
