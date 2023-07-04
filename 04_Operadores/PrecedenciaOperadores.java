
public class PrecedenciaOperadores {
    public static void main(String[] args) {
        System.out.println("PRECEDENCIA DE OPERADORES\n");

        System.out.println("Prioridad por niveles");
        System.out.println(" ++ -- +(unario) -(unario) !");
        System.out.println(" ()");
        System.out.println(" * / %");
        System.out.println(" + -");
        System.out.println(" > >= < <= instanceof");
        System.out.println(" == !=");
        System.out.println(" &&");
        System.out.println(" ||");
        System.out.println(" ()?:");
        System.out.println(" = += -= *= /= %=\n"); 

        System.out.println(" *Si están al mismo nivel hace el que encuentre primero de izquierda a derecha\n");

        int i = 3;
        System.out.println("i = " + i);
        System.out.println("i++ - --i + 1 / 4d * 10 = " + (i++ - --i + 1 / 4d * 10));
        System.out.println(" 3 - 3 + .25 * 10");
        System.out.println(" 0 + 2.5");
        System.out.println(" 2.5");
    }
}
