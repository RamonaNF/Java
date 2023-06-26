
public class ConversionDeTipos {
    public static void main(String[] args) {
        // ______________________________________________________________________________

        String enteroStr = "895", realStr = "3468.76e-3", logicStr = "FaLsE";

        System.out.println("String -> primitivoNumBool = NumBool.parseNumBool(String)\n");

        System.out.println("  enteroStr = " + enteroStr + " [" + enteroStr.getClass() + "]");
        System.out.println("    e.g. short = " + Short.parseShort(enteroStr) + '\n'); //+1????
        
        System.out.println("  realStr = " + realStr + " [" + realStr.getClass() + "]");
        System.out.println("    e.g. double = " + Double.parseDouble(realStr) + '\n');

        System.out.println("  logicStr = " + logicStr + " [" + logicStr.getClass() + "]");
        System.out.println("    e.g. boolean = " + Boolean.parseBoolean(logicStr) + '\n');

        // ______________________________________________________________________________

        int entero = 453;
        float real = 3.47523e2F;

        System.out.println("Clase wrapper");
        System.out.println("   primitivoNumBool -> String = NumBool.toString(primitivoNumBool)");
        System.out.println("Sobrecarga de método");
        System.out.println("   primitivoNumBool -> String = String.valueOf(primitivoNumBool)\n");

        System.out.println("  e.g. entero = " + entero);
        System.out.println("    String (cw) = " + Integer.toString(entero+1));
        System.out.println("    String (sdm) = " + String.valueOf(entero+2) + '\n');

        System.out.println("  e.g. float = " + real);
        System.out.println("    String (cw) = " + Float.toString(real-1));
        System.out.println("    String (sdm) = " + String.valueOf(real-2) + '\n');

        // ______________________________________________________________________________

        System.out.println("TYPE CASTING (data type: primitive -> primitive)");
        System.out.println("  Ojo: Con la pérdida/interpretación de info que puede haber");

        int castTest = 32768;

        //short castShort = castTest; // Marca error por posible pérdida de info (menos bits)
        short castShort = (short)castTest; // Forzamos la conversión
        System.out.println("  e.g. int -> short (Short.MAX_VALUE+1): " + castShort);
        char castChar = (char)castTest; // Lo toma como la representación en unicode
        System.out.println("       int -> char (unicode): " + castChar + '\n');

        long castLong = castTest; // No hay problema porque engloba el tamanio de int
        System.out.println("  int -> long: " + castLong);

        // No se soporta entre cada tipo de dato
        //boolean castBool = (boolean)castTest; // Descomentar para ver el error

        float castFloat = (float)castTest;
        System.out.println("  int -> float: " + castFloat + '\n');

        // ______________________________________________________________________________
    }
}
