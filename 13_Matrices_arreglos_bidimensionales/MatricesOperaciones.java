
public class MatricesOperaciones {
    public static void main(String[] args) {
        int[][] unidades = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] decenas = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int[][] resultado = new int[unidades.length][unidades[0].length];
        int sumaFil, sumaCol;

        System.out.println("OPERANDING CON MATRICES");
        System.out.println(" Ojo: Es importante trabajar con matrices cuadradaaas\n"); 



        System.out.println("OPERACIONES ARITMÉTICAS");

        for(int i = 0; i < resultado.length; i++) {
            for(int unidad: unidades[i]) {
                System.out.print(" " + unidad);
            }
            System.out.print("  | ");

            for(int decena: decenas[i]) {
                System.out.print(" " + decena);
            }
            System.out.println("");

            for(int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = unidades[i][j] + decenas[i][j]; // SUMA
                //resultado[i][j] = unidades[i][j] - decenas[i][j]; // RESTA
                //resultado[i][j] = unidades[i][j] * decenas[i][j]; // MULTIPLICACIÓN
                //resultado[i][j] = unidades[i][j] / decenas[i][j]; // DIVISIÓN
            }
        }

        System.out.println("\nOperación: SUMA"); // SUMA | RESTA | MULTIPLICACIÓN | DIVISIÓN
        for(int[] fila: resultado) {
            for(int res: fila) {
                System.out.print(" " + res);
            }
            System.out.println("");
        }



        System.out.println("\nSUMA DE FILAS Y COLUMNAS");
        System.out.println(" -> Resultado\n");
        
        for(int i = 0; i < resultado.length; i++) {
            sumaFil = 0;
            sumaCol = 0;

            for(int j = 0; j < resultado[i].length; j++) {
                sumaFil += resultado[i][j];
                sumaCol += resultado[j][i];
            }

            System.out.println(" " + i + " Fil: " + sumaFil);
            System.out.println("   Col: " + sumaCol + "\n");            
        }
    }
}
