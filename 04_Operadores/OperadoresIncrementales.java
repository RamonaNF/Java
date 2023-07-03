
public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("OPERADORES INCREMENTALES (incremento | decremento)\n");

        System.out.println(" Pre: primero se actualiza su valor, luego se asigna");
        System.out.println("Post: primero se asigna su valor, luego se actualiza\n");

        System.out.println("PREincremento");
        System.out.println("   i = " + i);
        System.out.println(" ++i = " + (++i));
        System.out.println("   i = " + i + '\n');

        System.out.println("POSTincremento");
        System.out.println("   i = " + i);
        System.out.println(" i++ = " + (i++));
        System.out.println("   i = " + i + '\n');

        System.out.println("PREdecremento");
        System.out.println("   i = " + i);
        System.out.println(" --i = " + (--i));
        System.out.println("   i = " + i + '\n');

        System.out.println("POSTdecremento");
        System.out.println("   i = " + i);
        System.out.println(" i-- = " + (i--));
        System.out.println("   i = " + i);
    }
    
}
