
import java.util.Scanner;

public class SentenciaSwitchCase { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String busca = "hoola?";
        
        System.out.println("SWITCH CASE");
        System.out.println(" Evalúa valores");
        System.out.println(" Soporta char, byte, short, int, sus clases wrapper, String y enum\n\n");

        System.out.println("busca = " + busca + '\n');

        switch(busca) {
            case "¡Adiós!":
                System.out.println("¡Hasta prontooo!\n");
                break;
            
            case "hoola?":
                System.out.println("Saludos terricola");
                System.out.println("Recuerda poner break en tus casos o, al haber coincidencia, se ejecutará todo a partir de ahí\n");
                //break; // Descomentar para ver cómo acaba aquí

            default:
                System.out.println("Has entrado al caso default :O\n");
        }

        System.out.println("\nJuguemos a... adivina el mes");
        String nombreMes = "";

        System.out.print(" Dame un número entero: ");
        int mes = scanner.nextInt();

        switch(mes) {
            case 1:
                nombreMes = "Enero";
                break;

            case 2:
                nombreMes = "Febrero";
                break;

            case 3:
                nombreMes = "Marzo";
                break;

            case 4:
                nombreMes = "Abril";
                break;

            case 5:
                nombreMes = "Mayo";
                break;

            case 6:
                nombreMes = "Junio";
                break;

            case 7:
                nombreMes = "Julio";
                break;

            case 8:
                nombreMes = "Agosto";
                break;

            case 9:
                nombreMes = "Septiembre";
                break;

            case 10:
                nombreMes = "Octubre";
                break;

            case 11:
                nombreMes = "Noviembre";
                break;

            case 12:
                nombreMes = "Diciembre";
                break;

            default:
                nombreMes = "Indefinido";
                break;
        }

        System.out.println("\nTu mes eeeees ¡" + nombreMes + '!');

        scanner.close();
    }
}
