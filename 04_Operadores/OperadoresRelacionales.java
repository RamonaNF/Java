
public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 2147483647;
        byte j = 127;
        boolean ejemplo;

        System.out.println("OPERADORES RELACIONALES");
        System.out.println(" OJO con las clases: .equals() compara valores de objetos, == compara sus referencias\n");
        
        System.out.println(" i = " + i);
        System.out.println(" j = " + j + '\n');

        System.out.println(" i == j " + (i == j));
        System.out.println(" i != j " + (i != j)); // <> distinto
        System.out.println(" i >= j " + (i >= j));
        System.out.println(" i <= j " + (i <= j) + '\n');


        ejemplo = i < j;
        System.out.println("PRIORIDAD");
        System.out.println(" e.g. ejemplo = i < j\n");

        System.out.println(" 1. Operadores relacionales   (i < j) { " + (i < j) + " }");
        System.out.println(" 2. Operadores de asignación  ejemplo = " + ejemplo);
    }
}
