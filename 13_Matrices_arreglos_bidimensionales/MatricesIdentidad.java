
public class MatricesIdentidad {
    public static void main(String[] args) {
        int len = (int) Math.floor(Math.random() * 9) + 1; // [1 - 9]
        int[][] matrizUnidad = new int[len][len];
        int[][] matrizMarco = new int[len][len];
        int[][] matrizCombinada = new int[len][len];

        System.out.println("->-<->-<->-<->-<->-< DESPLEGANDO PATRONES >-<->-<->-<->-<->-<-\n");

        for(int i = 0; i < len; i++) {
            matrizUnidad[i][i] = 1;
            
            matrizMarco[0][i] = 1;
            matrizMarco[i][0] = 1;
            matrizMarco[len - 1][i] = 1;
            matrizMarco[i][len - 1] = 1;

            matrizCombinada[i][i] = 1;
            matrizCombinada[0][i] = 1;
            matrizCombinada[i][0] = 1;
            matrizCombinada[len - 1][i] = 1;
            matrizCombinada[i][len - 1] = 1;
        }

        for(int i = 0; i < len; i++) {
            for(int unidad: matrizUnidad[i]) {
                System.out.print(" " + unidad);
            }
            System.out.print("  | ");

            for(int marco: matrizMarco[i]) {
                System.out.print(" " + marco);
            }
            System.out.print("  | ");

            for(int combinacion: matrizCombinada[i]) {
                System.out.print(" " + combinacion);
            }
            System.out.println("");
        }
    }
}
