
public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 11;
        
        System.out.println("OPERADORES ASIGNACIÓN");
        System.out.println(" i = 11\n");

        System.out.println("Operadores compuestoss");
        i -= -2;
        System.out.println(" i -= -2: " + i);
        i *= 10;
        System.out.println(" i *= 10: " + i);
        i += 4;
        System.out.println(" i +=  4: " + i + '\n');
        
        System.out.println("NOTA: El \"+=\" también puede ser usado para formar Strings\n");

        String sqlString = "SELECT * FROM clientes AS c";
        String cond = " WHERE c.nombre = 'Andres' AND c.activo = ";
        char complemento = '1';

        System.out.println("         sqlString = " + sqlString);
        System.out.println("     (string) cond = " + cond);
        System.out.println("(char) complemento = " + complemento + '\n');

        sqlString += cond + complemento;

        System.out.println("sqlString += cond + complemento");
        System.out.println("sqlString = " + sqlString);
    }
}
