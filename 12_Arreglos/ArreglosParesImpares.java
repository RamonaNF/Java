
import java.util.Scanner;

public class ArreglosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] datos = new int[5];
        int par = 0, impar = 0;

        System.out.println("CLASIFICANDO PARES E IMPARES\n");

        System.out.println("Ingresa " + datos.length + " números");
        for(int i = 0; i < datos.length; i++) {
            System.out.print(" Número " + (i + 1) + ": ");
            datos[i] = scanner.nextInt();

            if(datos[i] % 2 == 0) par++;
            else impar++;
        }

        int[] pares = new int[par], impares = new int[impar];
        impar = 0;
        par = 0;

        for(int i = 0; i < datos.length; i++) {
            if(datos[i] % 2 == 0) pares[par++] = datos[i];
            else impares[impar++] = datos[i];
        }

        System.out.println("\n" + pares.length + " pares");
        for(int elem: pares) {
            System.out.print(elem + " ");
        }

        System.out.println("\n\n" + impares.length + " impares");
        for(int elem: impares) {
            System.out.print(elem + " ");
        }
        System.out.println("");

        scanner.close();
    }
}
