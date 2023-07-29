
import java.util.Scanner;

public class ArreglosDetectarOrden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asc = false, desc = false;
        int[] datos = new int[3];

        System.out.println("DETECTANDO EL ORDEN DE UN ARREGLO\n");

        System.out.println("Ingrese " + datos.length + " números");
        for(int i = 0; i < datos.length; i++){
            System.out.print(" Número " + (i + 1) + ": ");
            datos[i] = scanner.nextInt();
        }
        System.out.println("");

        for(int i = 0; i < datos.length - 1; i++) {
            if(datos[i] > datos[i+1]) {
                desc = true;
            } else if(datos[i] < datos[i+1]) {
                asc = true;
            }
        }

        if(!asc && !desc == true) {
            System.out.println("Ingresaste el mismo número " + datos.length + " veceeees :P");
        } else if(asc && desc == true) {
            System.out.println("El arreglo está todo desordenadoooo :P");
        } else if(!asc && desc == true) {
            System.out.println("Orden descendente :D");
        } else { // asc && !desc == true
            System.out.println("Orden ascendente :D");
        }

        scanner.close();
    }
}
