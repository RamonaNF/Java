
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("OPERADOR TERNARIO");
        System.out.println(" if-else que retorna un valor");
        System.out.println(" 3 partes: condición, retorno if (true|false)\n\n");

        float mate, ciencias, historia, promedio = 0F;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tus calificaciones (de 0 a 100)\n");
        System.out.println("BOLETA");

        System.out.print(" Mate: ");
        mate = scanner.nextFloat();
        promedio += mate;

        System.out.print(" Historia: ");
        historia = scanner.nextFloat();
        promedio += historia;

        System.out.print(" Ciencias: ");
        ciencias = scanner.nextFloat();
        promedio += ciencias;

        promedio /= 3;
        System.out.println("\nPromedio: " + promedio);
        System.out.print("Status: ");
        System.out.println((promedio >= 70.0)?"Aprobado":"Reprobado");

        scanner.close();
    }
}
