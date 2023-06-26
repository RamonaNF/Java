
public class PrimitivosEnteros {
    public static void main(String[] args) {
        // Primitivos enteros
        System.out.println("PRIMITIVOS ENTEROS\n");

        System.out.println("byte\n  "+ Byte.BYTES + " byte(s)\n  "+ Byte.SIZE + " bit(s)\n");
        System.out.println("short\n  "+ Short.BYTES + " byte(s)\n  "+ Short.SIZE + " bit(s)\n");
        System.out.println("int\n  "+ Integer.BYTES + " byte(s)\n  "+ Integer.SIZE + " bit(s)\n");
        System.out.println("long\n  "+ Long.BYTES + " byte(s)\n  "+ Long.SIZE + " bit(s)\n");

        System.out.println(" byte  " + Byte.MIN_VALUE);
        System.out.println(" byte  " + Byte.MAX_VALUE);
        System.out.println("short  " + Short.MAX_VALUE);
        System.out.println("  int  " + Integer.MAX_VALUE);
        System.out.println(" long  " + Long.MAX_VALUE + '\n');

        long ojoConEstaDeclaracion = 2147483648L;

        // Si nos excedemos se usan los flotantes (float F | double D)
        double numGrandote = 9223372036854775808D;

        // Por defecto var es int (si te pasas debes especificar L|F|D)
        var mayorQueLong = 9223372036854775808F; // Quitar flotante para ver el error
    }
}
