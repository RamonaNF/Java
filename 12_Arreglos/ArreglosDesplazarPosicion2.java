
import java.util.Scanner;

public class ArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int pos = -1, num = -1;
        Scanner scanner = new Scanner(System.in);
        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};

        System.out.println("DESPLAZAMIENTOS E INSERCIONES\n");

        System.out.print("Original: ");
        printArr(data);

        System.out.println("\nNúmero a insertar: ");
        num = scanner.nextInt();
        System.out.println("Posición (0 - " + (data.length - 1) + "):");
        pos = scanner.nextInt();

        for(int i = data.length - 2; i >= pos; i--) {
                data[i + 1] = data[i];
        }

        data[pos] = num;

        System.out.print("\nModificado: ");
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
