
import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "amarillo", "rojo", "verde", "morado", "naranja", "blanco", "negro", "rosa", "marrón"};
        int luck = -1;

        System.out.println("GENERANDO NÚMEROS ALEATORIOS...\n");


        System.out.println("1.- Math.random()\n");

        System.out.println("  Rango estándar: [0.0, 1.0)");
        System.out.println("  Random = " + Math.random() + '\n');

        System.out.println("  Rango: [0.0, n.0) -> Random * n");
        System.out.println("    e.g. [0.0, 6.0)");
        System.out.println("          Random * 6 = " + Math.random()*6 + '\n');

        System.out.println("  Rango: {r | r \u2208 N, 0 < r <= n} -> ceil(Random * n)");
        System.out.println("  Rango: {r | r \u2208 N, 0 <= r < n} -> floor(Random * n)");
        System.out.println("  Rango: {r | r \u2208 N, 0 <= r <= n} -> round(Random * n)\n");

        System.out.print(" Tu color y número de la suerte en este instante son... ");
        luck = (int)Math.floor(Math.random() * colores.length);
        System.out.println(colores[luck] + ", " + luck + '\n');


        System.out.println("2.- Clase Random\n");
        Random randomObj = new Random();

        System.out.println("  Random int = " + randomObj.nextInt());
        System.out.println("  Random long = " + randomObj.nextLong() + '\n');

        System.out.println("  Rango: [0, n) -> nextInt(n)");
        System.out.println("    e.g. [0, 12)");
        System.out.println("          Random int = " + randomObj.nextInt(12) + '\n');

        System.out.println("  Rango: [n, m) -> n + nextInt(m - n)");
        System.out.println("    e.g. [12, 24)");
        System.out.println("          Random int = " + (12 + randomObj.nextInt(24 - 12)) + '\n');

        System.out.println("  Rango: [n, m] -> n + nextInt(m - n + 1)");
        System.out.println("    e.g. [12, 24]");
        System.out.println("          Random int = " + (12 + randomObj.nextInt(24 - 12 + 1)) + '\n');

        System.out.print(" Veamos si tu suerte ha cambiado... ");
        luck = randomObj.nextInt(colores.length);
        System.out.println(colores[luck] + ", " + luck + " :O");
    }
}
