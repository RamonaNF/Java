
public class HolaMundo {
    public static void main(String[] args) { 
        // ______________________________________________________________________________

        // Hardcoded
        System.out.println("Hola Mundooo... hardcodeado\n");

        // Código reutilizable y más manipulable
        String saludo = "Hola Mundooo... con variable";

        System.out.println(saludo);
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase() + '\n');

        // ______________________________________________________________________________

        // Clases que envuelven al primitivo (aumentan su funcionalidad)
        int num = 10;

        System.out.println("num = " + num);
        System.out.println("Integer.sum(num, num) = " + Integer.sum(num, num) + '\n');

        // ______________________________________________________________________________

        // Tipado dinámico

        var miVariable = "No le dije qué soy, pero me reconoce como String";

        System.out.println("miVariable = " + miVariable);
        System.out.println("miVariable.getClass() = " + miVariable.getClass() + '\n');

        // ______________________________________________________________________________

        // Contexto de una variable ---> Delimitado por las llaves { }

        boolean ejemplo = true;

        while (ejemplo) {
            // Podemos modificarla porque puede usarse dentro del main
            System.out.println("Entré usando una variable declarada en un contexto superior");
            ejemplo = false;

            var test = "Hola? Es imposible ver este mensaje fuera del while";
        }

        // No se reconoce test porque no estamos dentro de los límites de su contexto
        System.out.println("Pero no puedo acceder a variables fuera de su límite\n");
        //System.out.println(test); // Descomentar para ver el error

        // ______________________________________________________________________________
    }
}
