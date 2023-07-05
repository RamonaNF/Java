
public class SentenciaForEach {
    public static void main(String[] args) {
        System.out.println("SENTENCIA FOR EACH");
        System.out.println(" Para iterar sobre elementos de un arreglo u objetos de colección de java\n");

        String[] lenguajes = {"C++", "Python", "MATLAB", "R", "JavaScript", "PHP", "TypeScript", "C#", "Prolog", "Racket", "Java"};
        System.out.println("Algunos lenguajes de programación...");

        for(String elem: lenguajes) {
            System.out.println("elem: " + elem);
        }
    }
}
