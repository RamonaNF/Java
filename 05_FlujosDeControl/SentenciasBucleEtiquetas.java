
public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        int loop = 1;

        System.out.println("USO DE ETIQUETAS");
        System.out.println(" Para break y continue\n");

        bucle1:
        for(int i = 0; i <= 5; i++) {
            System.out.print("\n" + i + ": ");

            for(int j = 0; j < 3; j++) {
                if(i%2 == 0) {
                    System.out.println("Es par, b" + "a".repeat(i+1) + "ng");
                    continue bucle1;
                }
                System.out.print((j+1) + "... ");
            }

            System.out.println("Es imp" + "a".repeat(i) + "r");
        }

        System.out.println("\n\nWorking schedule");
        bucle2:
        do {
            System.out.print("\nDAY " + loop);

            inner1:
            for(int i = 1; i < 9; i++) {
                if(loop == 6 || loop == 7) {
                    continue inner1;
                } else if(i == 1) {
                    System.out.print("\n Trabajanding... 1 hr ");
                    continue inner1;
                }
                System.out.print(i + " hrs ");
            }

            System.out.println("\n Descansito");

            loop++;
            if(loop == 8) {
                System.out.println("\nUpss, there aren't " + loop + " days in a week, right!?");
                System.out.println("Bye byee");
                break bucle2;
            }
        } while(true);
    }
}
