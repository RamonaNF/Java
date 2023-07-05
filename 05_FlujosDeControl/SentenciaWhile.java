
public class SentenciaWhile {
    public static void main(String[] args) {
        boolean condicion = false;

        System.out.println("SENTENCIA WHILE vs DO WHILE\n");

        System.out.println("Iteración");
        System.out.println(" While - precondición: Primero verifica la expresión, luego actúa en consecuencia");
        System.out.println(" Do while - postcondición: Primero actúa, luego se guía por la expresión\n");

        System.out.println("condicion = " + condicion);

        System.out.println("Respuesta while: ");
        while(condicion) {
            System.out.println("Nunca me ejecuto, porque la condición es falsa");
        }
    
        System.out.print("Respuesta do while: ");
        do {
            System.out.println("Yo me ejecuto al menos una vez sin importar la expresión jejee");
        } while (condicion);
    }
}
