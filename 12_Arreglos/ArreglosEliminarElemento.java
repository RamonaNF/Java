
import java.util.Scanner;

public class ArreglosEliminarElemento {
    public static void main(String[] args) {
        int pos = 0, num = -1;
        Scanner scanner = new Scanner(System.in);
        Integer[] data = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        System.out.println("ELIMINANDO UN ELEMENTO\n");

        System.out.print("Original: ");
        printArr(data);

        System.out.println("\nNúmero a eliminar: ");
        num = scanner.nextInt();

        for(; pos < data.length && !data[pos].equals(num); pos++) {}

        for(int i = pos; i < data.length - 1; i++) {
                data[i] = data[i + 1];
        }

        System.out.print("\nModificado: ");

        if(pos != data.length) {
            Integer[] smallerArray = new Integer[data.length - 1];
            System.arraycopy(data, 0, smallerArray, 0, smallerArray.length); 
                          // origen, inicio, destino, inicio, #elementos
            printArr(smallerArray);
        } else {
            printArr(data);
        }

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
