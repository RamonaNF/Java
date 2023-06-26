
public class PrimitivosFlotantes {
    public static double defaultDouble;

    public static void main(String[] args) {
        // Primitivos flotantes
        System.out.println("PRIMITIVOS DE PUNTO FLOTANTE\n");

        // Dentro de métodos no tienen valor por default, hay que asignarlo
        float ejemplo;
        //System.out.println("ej: " + ejemplo); // Descomentar para ver el error

        float precisionSimple = 11F;
        System.out.println("FLOAT: precisionSimple");
        System.out.println("float\n  "+ Float.BYTES + " byte(s)\n  "+ Float.SIZE + " bit(s)");
        System.out.println("  (" + Float.MIN_VALUE + ", " + Float.MAX_VALUE + ")\n");

        double precisionDoble = 1003.0; 
        System.out.println("DOUBLE: precisionDoble");
        System.out.println("double\n  "+ Double.BYTES + " byte(s)\n  "+ Double.SIZE + " bit(s)");
        System.out.println("  (" + Double.MIN_VALUE + " - " + Double.MAX_VALUE + ")\n");

        // Representación compacta con notación exponencial
        System.out.println("Notación exponencial");
        System.out.println("0.00000010303 = " + 0.00000010303 + '\n'); // 1.0303E-7
                                                                       // Mantisa elevado al valor
        
        // Valores por default 
        System.out.println("Los primitivos equivalen a 0 por default");
        System.out.println(" SOLO si se trata de atributos de una clase");
        System.out.println(" SINO un valor debe ser asignado\n");

        System.out.println("defaultDouble = " + defaultDouble + '\n');
    }
}
