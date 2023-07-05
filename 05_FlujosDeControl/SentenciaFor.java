
public class SentenciaFor {
    public static void main(String[] args) {
        int loop = 0;
        
        System.out.println("SENTENCIA FOR\n");
        
        System.out.println("Puedes omitir la inicialización, condición de término o incremento/decremento");
        System.out.println(" for(;;) {");

        for(;;) {
            System.out.println("   Soy infinitoooooo");
            loop++;
            
            if(loop == 10) {
                System.out.println("   Ah no, todo está bajo control jijiji");
                break;
            }
        }

        System.out.println(" }");
        System.out.println("Pero cuida monitorearlo de alguna forma o se volverá infinito de verdad...\n");

        System.out.println("¡Puede tener más de una variable de controol!");
        System.out.println(" for(int i = 1, j = 10; i < j; i++, j++) {");
        
        for(int i = 1, j = 10; i < j; i++, j--) {
            System.out.println("   " + i + " vs " + j);
        }

        System.out.println(" }");
    }
}
