
public class Matrices {
    public static void main(String[] args) {
        int[][] movs = new int[4][2];
        String[][] prueba = {{"OJITOU:", "Las columnas", "pueden"}, {"tener"}, {"un tamaño", "distintoo"}}; 
        // En ese caso se debe espacificar el tamaño de cada una
        //   prueba = new String[3][];
        //   prueba[0] = new String[3];   prueba[1] = new String[1];   prueba[2] = new String[2];

        movs[0][0] = 1;
        movs[0][1] = 0;

        movs[1][0] = -1;
        movs[1][1] = 0;

        movs[2][0] = 0;
        movs[2][1] = 1;

        movs[3][0] = 0;
        movs[3][1] = -1;

        System.out.println("TRABAJANDING CON MATRICEEES");
        System.out.println(" | Declarar, iterar, jugar con el tamaño y lo básico namás :)\n");

        System.out.println("matrizMovimientos");

        System.out.println("  Filas: " + movs.length);
        System.out.println("  Columnas: " + movs[0].length + '\n');

        for(int i = 0; i < movs.length; i++) {
            System.out.print("  " + i + "   ");
            for(int j = 0; j < movs[i].length; j++) {
                System.out.print("[" + j + "] = " + movs[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("  Primer elemento: " + movs[0][0]);
        System.out.println("  Último elemento: " + movs[movs.length - 1][movs[movs.length - 1].length - 1] + '\n');

        for(String[] fila: prueba) {
            for(String elemCol: fila) {
                System.out.print(elemCol + " ");
            }
        }
        
        System.out.println("\nmatrizPrueba");
        System.out.println("  Filas: " + prueba.length);
        System.out.println("  Columnas: " + prueba[0].length + ", " + prueba[1].length + ", " + prueba[2].length);
    }
}
