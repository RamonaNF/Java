
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        System.out.println("Convertidor: Sist numérico\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero : ");
        //String numStr = scanner.nextLine(); // Espera un input tipo String

        int numDecimal = 0;
        try {
            //numDecimal = Integer.parseInt(numStr);
            numDecimal = scanner.nextInt(); // Espera un input tipo int
        } catch (/*NumberFormatException*/InputMismatchException e) { // Exception
            System.out.println("ERROR\nDebe ingresarse un número entero\n\n\n\n");
            main(args);
            System.exit(0);
        }

        String mensaje = "numDecimal = " + numDecimal + "\n\n";
        String msgBinario = "binaryString: " + Integer.toBinaryString(numDecimal) + '\n';
        String msgOctal = "octalString: " + Integer.toOctalString(numDecimal) + '\n';
        String msgHexadecimal = "hexString: " + Integer.toHexString(numDecimal) + '\n';
        
        mensaje += msgBinario + msgOctal + msgHexadecimal;

        System.out.println("\nSISTEMA NUMÉRICO");
        System.out.println(mensaje);

        scanner.close();
    }
}
