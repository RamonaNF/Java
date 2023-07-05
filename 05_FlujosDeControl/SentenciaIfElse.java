
public class SentenciaIfElse {
    public static void main(String[] args) {
        System.out.println("IF-ELSE");
        System.out.println(" Evalúa expresiones booleanas");
        System.out.println(" Bloques de instrucciones mutuamente excluyentes\n");

        System.out.println("¿Cómo te sientes el día de hoy?");
        
        float animo = 4.7F; // En un rango del 0 al 5
        System.out.println("animo = " + animo);

        // Las llaves son opcionales si se trata de una línea de código
        if(animo > 4) System.out.println(" :D Emocionado"); 
        // Pero como buena práctica, se recomienda siempre ponerlas
        else if(animo > 3) {
            System.out.println(" :) Feliz");
        } else if(animo > 2) {
            System.out.println(" :P En calma");
        } else if(animo > 1) {
            System.out.println(" :/ Disgustado");
        } else {
            System.out.println(" :| Molesto");
        }
    }
}
