
public class ArreglosCombinados {
    public static void main(String[] args) {
        int[] a = {0, 2, 4, 6, 8, 10};
        int[] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};

        int pos = 0;
        int[] c = new int[a.length + b.length];

        System.out.println("COMBINANDO ARREGLOS");

        for(int i = 0; i < a.length; i++) {
            c[pos++] = a[i];
            /*
            c[pos++] = b[2 * i];
            c[pos++] = b[2 * i + 1];
            */
            c[pos++] = b[b.length - 1 - (2 * i)];
            c[pos++] = b[b.length - 1 - (2 * i + 1)];
        }

        for(int elem: c) {
            System.out.print(elem + "   ");
        }
        System.out.println("");
    }
}
