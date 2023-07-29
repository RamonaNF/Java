
public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, resultado = 0;

        System.out.println("CALCULADORA");
        System.out.println(" Argumentos: operador num1 num2");

        if(args.length < 3) {
            System.err.println("\nERROR: Favor de ingresar la información necesaria mediante la línea de comando");
            System.exit(-1);
        } 

        System.out.println(" Argumentos: " + args[0] + " " + args[1] + " " + args[2] + '\n');
        
        if(args[0].length() > 1) {
            System.out.println("ADVERTENCIA\n  Los operadores disponibles son + - * / %");
            System.out.println("  Favor de verificar la información ingresada");
            System.exit(1);
        }

        char operador = args[0].charAt(0);
        try {
            num1 = Double.parseDouble(args[1]); 
            num2 = Double.parseDouble(args[2]);
        } catch (Exception e) {
            System.err.println("ERROR: Favor de ingresar números válidos");
            System.exit(-1);
        }

        switch(operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if(num2 == 0) {
                    System.err.println("ERROR: No es posible dividir entre cero");
                    System.exit(-1);
                }
                resultado = num1 / num2;
                break;
            case '%':
                resultado = num1 % num2;
                break;
            default:
                System.out.println("ADVERTENCIA\n  Los operadores disponibles son + - * / %");
                System.out.println("  Favor de verificar la información ingresada");
                System.exit(-1);
        }

        System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);
    }
}
