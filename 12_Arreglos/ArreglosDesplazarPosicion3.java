
import java.util.Scanner;

public class ArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        int pos = 0, num = -1;
        Scanner scanner = new Scanner(System.in);
        Integer[] data = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100, 0};

        System.out.println("DESPLAZAMIENTOS E INSERCIONES ORDENADAS\n");

        System.out.print("Original: ");
        printArr(data);

        System.out.println("\nNúmero a insertar: ");
        num = scanner.nextInt();

        for(; pos < data.length - 1 && data[pos] < num; pos++) {}

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
