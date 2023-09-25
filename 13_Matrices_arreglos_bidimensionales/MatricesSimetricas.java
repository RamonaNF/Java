
public class MatricesSimetricas {
    public static void main(String[] args) {
        boolean simetrica = true;
        String[][] matriz = {
            {"pepe", "pecas", "pica"},
            {"pica", "papas", "con un"}, // Simétrica: {"pecas", "papas",  "con un"},
            {"pica", "con un", "pico"} 
        };
        String[][] cancionNxN = {
            {"a", "o uuuu", "más"},
            {"e", "el burro", "que"},
            {"i", "sabe", "túúú"} 
        };
        String[][] cancionNxM = {
            {"a", "el"},
            {"e", "burro"},
            {"i", "sabe"},
            {"o", "más"},
            {"uuuu", "que túúú"}
        };
        String[][] traspuesta = new String[ cancionNxM[0].length ][ cancionNxM.length ];



        System.out.println("MATRICES... SIMÉTRICAS vs TRASPUESTAS");

        System.out.println("\nSimétrica | Matriz -> Trasposición");
        System.out.println(" ij == ji   (n x m)     (m x n)");
        System.out.println("  a e d      a b c       a d g");
        System.out.println("  e b f      d e f       b e h");
        System.out.println("  d f c      g h i       c f i\n\n");



        imprime(matriz);

        verificar:
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < i; j++) {
                if(matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    System.out.println("\nOyeee, no es simétrica >:(\n\n");
                    break verificar;
                }
            }
        }

        if(simetrica) {
            System.out.println("\nYeahhh ¡es simétricaaa! :D\n\n");
        }



        System.out.println("Trasponiendo matrices de NxN :O\n");
        System.out.println("ORIGINAL");
        imprime(cancionNxN);

        for(int i = 0; i < cancionNxN.length; i++) {
            for(int j = 0; j < i; j++) {
                String aux = cancionNxN[i][j];
                cancionNxN[i][j] = cancionNxN[j][i];
                cancionNxN[j][i] = aux;
            }
        }

        System.out.println("\nTRASPUESTA");
        imprime(cancionNxN);



        System.out.println("\n\n¿Y qué tal de NxM ehhh? :U");
        imprime(cancionNxM);
        
        for(int i = 0; i < cancionNxM.length; i++) {
            for(int j = 0; j < cancionNxM[i].length; j++) {
                traspuesta[j][i] = cancionNxM[i][j];
            }
        }
        
        System.out.println("\nVoilà! Así se ve una matriz traspuesta de NxM\n");
        imprime(traspuesta);
        System.out.println("\n ...nada del otro mundooo :P");
    }

    public static void imprime(Object[][] matriz) {
        for(Object[] fila: matriz) {
            for(Object elem: fila) {
                System.out.print("[" + elem + "] ");
            }
            System.out.println("");
        }
    }
}
