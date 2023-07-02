
public class StringConcatenacion {
    public static void main(String[] args) {
        String seccion = "Mastering Strings", alumna = "Ramona NF";
        String detalle = seccion.concat(" with " + alumna);
        int num1 = 11, num2 = 1003;

        System.out.println(detalle + '\n');

        System.out.println("Precedencia de operadores");

        String aux = "     Concatenando como cadena: ";
        System.out.println(aux + num1 + num2);   
        
        aux = "     Cambiando precedencia con \"()\": ";
        System.out.println(aux + (num1 + num2)); 
        
        aux = " :Concatenando como int ";
        System.out.println(num1 + num2 + aux + '\n');   

        System.out.println("\n¡OJO!\n");
        System.out.println("  Los string son inmutables\n    Cualquier cambio implica que se creó una instancia distinta\n");
        System.out.println("  .concat() > +\n    Para concatenar con + se usan instancias de StringBuilder, por lo que .concat() resulta ser un poco más eficiente");
    }
}
