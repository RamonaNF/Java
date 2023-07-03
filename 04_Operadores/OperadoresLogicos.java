
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean m = false;

        System.out.println("OPERADORES LÓGICOS\n");

        System.out.println("m = " + m + '\n');

        System.out.println("PRIORIDAD 1");
        System.out.println(" Negación !m = " + !m + '\n');
        
        System.out.println("Conjunción && y disyunción ||");
        System.out.println(" Si el 1er operando es suficiente para tomar una decisión, no se evalúa el 2do\n");

        System.out.println("Conjunción & y disyunción |");
        System.out.println(" Se evalúan ambos operandos\n");

        System.out.println("PRIORIDAD 2: && &");
        System.out.println("PRIORIDAD 3: || |\n");

        System.out.println("false || false && false || true { " + (false || false && false || true) + " }");
        System.out.println("    false || false || true\n");

        System.out.println("((false || true) && false) || false { " + (((false || true) && false) || false) + " }");
        System.out.println("           (true && false) || false");
        System.out.println("                     false || false");
    }
}
