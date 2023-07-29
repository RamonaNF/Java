
import java.util.Scanner;

public class ArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        int pos = -1, num = -1, last = -1;
        Scanner scanner = new Scanner(System.in);
        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("DESPLAZAMIENTOS E INSERCIONES ---> JUGANDO CON EL TAMAÑO DE UN ARRAY\n");

        System.out.print("Original: ");
        printArr(data);

        System.out.println("\nNúmero a insertar: ");
        num = scanner.nextInt();
        System.out.println("Posición (0 - " + data.length + "):");
        pos = scanner.nextInt();

        if(pos == data.length) last = num;
        else  last = data[data.length - 1];

        for(int i = data.length - 2; i >= pos; i--) {
                data[i + 1] = data[i];
        }

        if(pos != data.length) data[pos] = num;

        Integer[] biggerArray = new Integer[data.length + 1];
        System.arraycopy(data, 0, biggerArray, 0, data.length);
        biggerArray[biggerArray.length - 1] = last;

        System.out.print("\nModificado: ");
        printArr(biggerArray);

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
