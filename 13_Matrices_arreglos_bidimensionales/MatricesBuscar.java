
import java.util.Scanner;

public class MatricesBuscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        int luckyRow;

        String[] options = {"S:stars", "s:satellites", "a:asteroids", "c:comets", "p:planets"};
        String[][] solarSystem= {
            {"S:SUN", "a:ASTEROID BELT", "s:GANYMEDE"},
            {"s:MOON", "c:DONATI"},
            {"p:EARTH", "S:POLARIS", "a:VESTA"},
            {"c:HALLEY", "p:Saturn"}
        };
        String target = options[ (int) Math.floor(Math.random() * options.length) ];
        

        System.out.println("STARGAZING THE SOLAR SYSTEM");
        System.out.println(" Todays' target: " + target.substring(2));
        
        System.out.print("\nChoose your lucky number (between 0 and " + (solarSystem.length - 1) + "): ");
        luckyRow = scanner.nextInt();

        for(int i = 0; i < solarSystem[luckyRow].length; i++) {
            if(solarSystem[luckyRow][i].charAt(0) == target.charAt(0)) {
                System.out.println("\nDiscovered: " + solarSystem[luckyRow][i].substring(2));
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("\nRats! You didn't find any " + target.substring(2) + " this time!!");
        }
        scanner.close();
    }
}
