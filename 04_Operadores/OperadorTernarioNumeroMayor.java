
import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max;

        System.out.println("Encontrando el mayor -> int(s)");

        System.out.print(" num1 = ");
        int num1 = scanner.nextInt();

        System.out.print(" num2 = ");
        int num2 = scanner.nextInt();

        max = (num1 > num2)?num1:num2;

        System.out.print(" num3 = ");
        int num3 = scanner.nextInt();

        max = (max > num3)?max:num3;
        System.out.println("El mayor es " + max);

        scanner.close();
    }
}
