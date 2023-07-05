
public class WrapperBoolean {
    public static void main(String[] args) {
        System.out.println("CLASE WRAPPER BOOLEAN");
        System.out.println(" Sea primitivo o referencia, los operadores usan el valor de su literal\n");

        Boolean positive = Boolean.valueOf(99 > 66);
        Boolean compare = true;
        Boolean negative = Boolean.valueOf("FaLsE");

        boolean primitivo = compare.booleanValue();

        System.out.println("positive = " + positive);
        System.out.println(" compare = " + primitivo);
        System.out.println("negative = " + negative + '\n');

        System.out.println("compare == negative { " + (compare == negative) + " }");
        System.out.println("compare.equals(negative) { " + compare.equals(negative) + " }\n");

        System.out.println("compare == positive { " + (compare == positive) + " }");
        System.out.println("compare.equals(positive) { " + compare.equals(positive) + " }");
    }
}
