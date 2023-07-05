
public class WrapperInteger {
    public static void main(String[] args) {
        int primitivo = 32768;
        String strVal = "986";

        System.out.println("\nCLASE WRAPPER INTEGER");
        System.out.println(" Le otorga mayor funcionalidad al primitivo\n\n");


        System.out.println("Declaración");
        System.out.println(" Autoboxing: Primitivo -> Referencia\n");

        System.out.println(" Deprecated!!");
        System.out.println("  new Integer(int)\n");
        Integer deprecatedWay = new Integer(25245);
        
        System.out.println(" Preferidas");

        System.out.println("  Declaración explícita: Integer.valueOf(int/String)");
        Integer explicitObj = Integer.valueOf(primitivo);
        Integer obj = Integer.valueOf(strVal);

        System.out.println("  Declaración implícita: = int\n\n");
        Integer implicitObj = primitivo;


        System.out.println("Funcionalidades\n");

        System.out.println("Unboxing: Referencia -> Primitivo");

        System.out.println(" Forma explícita: .intValue()");
        int explicitNum = implicitObj.intValue();

        System.out.println(" Forma implícita: = Integer\n");
        int implicitNum = explicitObj;
        
        System.out.println("Conversión de tipos");
        System.out.println(" OJO: No se recomienda pasar a uno de menor capacidad porque puede perderse información");
        System.out.println(" e.g. byteValue() shortValue()\n");

        System.out.println("intObj = " + explicitObj);
        
        Short shortObj = explicitObj.shortValue();

        System.out.println("shortObj = " + shortObj);


        System.out.println("\n\n* La forma implícita también es conocida como automática");
    }
}
