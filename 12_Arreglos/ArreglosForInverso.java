
import java.util.Arrays;

public class ArreglosForInverso {
    public static void main(String[] args) {
        char[] palabra = {'o', 'l', 'a'};
        int len = palabra.length;

        System.out.println("ITERANDO A LA INVERSA");
        System.out.print("  e.g. ¿");

        for(int i = 0; i < len; i++) {
            System.out.print(palabra[len - 1 - i]);
        }

        System.out.print("? ¡");
        Arrays.sort(palabra);

        for(int i = len - 1; i > -1; i--) {
            System.out.print(palabra[i]);
        }
        System.out.println("!");
    }
}
