
public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer numero = Integer.valueOf(20223);
        Integer number = numero;

        System.out.println("OPERADORES RELACIONALES CON CLASES WRAPPER\n");

        System.out.println("numero = " + numero);
        System.out.println("number = " + number + '\n');

        System.out.println("Si igualas un objeto a otro...");
        System.out.println(" ¿Apuntan a la misma referencia? " + (numero == number) + '\n');

        number = 20223;
        System.out.println(" ¿Y si solo tienen el mismo valor? " + (numero == number));
        System.out.println("  * Porque son instancias distintas\n\n");

        System.out.println("* El resto de los operadores relacionales y aritméticos usan el auto unboxing para realizar operaciones con primitivos");
        System.out.println("   ¡Gracias al intValue() y sus semejantess!\n\n");

        System.out.println("OJO con la siguiente particularidad de java...");
        System.out.println(" Para números menores o iguales a 127 el == compara automáticamente por valor\n");

        Double num = 127.01;
        Double numb = 127.01;
        System.out.println("num = " + num);
        System.out.println("numb = " + numb + '\n');

        System.out.println("     num == numb { " + (num == numb) + " }");
        System.out.println("num.equals(numb) { " + num.equals(numb) + " }\n");

        numero = 127;
        number = 127;
        System.out.println("numero = " + numero);
        System.out.println("number = " + number + '\n');

        System.out.println("     numero == number { " + (numero == number) + " }");
        System.out.println("numero.equals(number) { " + numero.equals(number) + " }");
    }
}
