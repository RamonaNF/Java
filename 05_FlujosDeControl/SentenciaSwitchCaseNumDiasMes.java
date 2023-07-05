
import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = 0, mes, anio;

        System.out.println("DÍAS DEL MES ? EN EL ANIO ? (SWITCH CASE)\n");

        System.out.print("   Ingresa el mes (MM): ");
        mes = scanner.nextInt();

        System.out.print("Ingresa el anio (YYYY): ");
        anio = scanner.nextInt();

        switch(mes) { 
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;

            case 2:
                dias = (anio % 400 == 0 || ((anio%4 == 0) && !(anio%100 == 0)))?29:28;
                break;

            default:
             dias = -1;
        }

        System.out.println("\nÚltimo día: " + dias + '/' + mes + '/' + anio);

        scanner.close();
    }
}
