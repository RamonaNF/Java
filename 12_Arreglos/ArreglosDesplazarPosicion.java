
import java.util.Scanner;

public class ArreglosDesplazarPosicion {
    public static void main(String[] args) {
        boolean normal = false; // true: desplazamientos a la derecha
        int movements = 0, aux = -1;
        Scanner scanner = new Scanner(System.in);
        Integer[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("DESPLAZAMIENTOOS\n");

        System.out.print("Original: ");
        printArr(data);

        System.out.println("\n¿Cuántos desplazamientos desea ver en acción?");
        System.out.print("Cantidad: ");
        movements = scanner.nextInt();

        movements %= data.length;

        while(!normal && movements > 0) {
            aux = data[0];

            for(int i = 1; i < data.length; i++) {
                data[i - 1] = data[i];
            }

            data[data.length - 1] = aux;

            movements--;
        }

        while(normal && movements > 0) {
            aux = data[data.length - 1];

            for(int i = data.length - 2; i > -1; i--) {
                data[i + 1] = data[i];
            }

            data[0] = aux;

            movements--;
        }

        System.out.print("\nDesplazado: ");
        printArr(data);

        scanner.close();
    }

    public static void printArr(Object[] arr) {
        String printStr = "{ ";

        for(Object elem: arr) {
            printStr += elem + ", ";
        }

        printStr += "\b\b }";
        System.out.println(printStr);
    }
}
