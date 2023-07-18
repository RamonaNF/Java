
public class StringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "o", b = "l", c = "a";
        StringBuilder sb = new StringBuilder(a);
        long ini, fin, concat, sum, strB;
        int itr = 1000;
        


        System.out.println("Inicia contador para .concat()");
        ini = System.currentTimeMillis();

        for(int i = 0; i < itr; i++) {
            a = a.concat(b).concat(c).concat(" ");
        }

        fin = System.currentTimeMillis();
        concat = fin-ini;
        System.out.println(" " + concat + " ms\n");
        //System.out.println("a = " + a + '\n');
        System.gc();



        a = "o";

        System.out.println("Inicia contador para +");
        ini = System.currentTimeMillis();

        for(int i = 0; i < itr; i++) {
            //a = a + b + c + " ";
            a += b + c + " "; // Abreviatura
        }

        fin = System.currentTimeMillis();
        sum = fin-ini;
        System.out.println(" " + sum + " ms\n");
        //System.out.println("a = " + a + '\n');
        System.gc();



        System.out.println("Inicia contador para StringBuilder");
        ini = System.currentTimeMillis();

        for(int i = 0; i < itr; i++) {
            //sb.append(b); sb.append(c); sb.append(" ");
            sb.append(b).append(c).append(" "); // Se invocan los métodos de forma encadenada
        }

        fin = System.currentTimeMillis();
        strB = fin-ini;
        System.out.println(" " + strB + " ms\n\n");
        //System.out.println("sb = " + sb.toString() + '\n');
        System.gc();



        System.out.println("RESUMEN");
        System.out.println("iteraciones = " + itr + '\n');

        System.out.println(concat + " ms .concat ()");
        System.out.println(sum + " ms +");
        System.out.println(strB + " ms StringBuilder\n");

        System.out.println("PODIUM");
        System.out.println(" 1. StringBuilder"); // Optimizaciones: Buffer | No es sincronizado
        System.out.println(" 2. .concat() > + {pocos elementos}"); // .concat() es quien más objetos almacena en memoria
        System.out.println(" 2. + > .concat() {muchos elementos}\n");

        System.out.println("  * El + usa StringBuilder, pero es ineficiente porque crea muchas instancias");
    }
}
