
public class ArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int pos = 0;
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] orden = new int[nums.length + ((nums.length % 2 == 0)?0:1)];

        System.out.println("I-ÉSIMO NÚMERO PRINCIPIO-FIN");

        for(int i = 0; i < nums.length - i; i++) {
            //System.out.println(nums[i] + ", " + nums[nums.length - 1 - i]);
            orden[pos++] = nums[i];
            orden[pos++] = nums[nums.length - 1 - i];
        }

        for(int elem: orden) {
            System.out.print(elem + "   ");
        }
        System.out.println("");
    }
}
