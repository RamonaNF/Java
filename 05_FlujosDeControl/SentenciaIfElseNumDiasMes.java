
import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = 0, mes, anio;

        System.out.println("DÍAS DEL MES ? EN EL ANIO ? (IF-ELSE)\n");

        System.out.print("   Ingresa el mes (MM): ");
        mes = scanner.nextInt();

        System.out.print("Ingresa el anio (YYYY): ");
        anio = scanner.nextInt();

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
            dias = 30;
        } else if(mes == 2) { 
            dias = (anio % 400 == 0 || ((anio%4 == 0) && !(anio%100 == 0)))?29:28;
        }

        System.out.println("\nÚltimo día: " + dias + '/' + mes + '/' + anio);

        scanner.close();
    }
}
