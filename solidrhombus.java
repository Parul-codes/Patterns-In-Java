public class solidrhombus {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for(i =1; i <= 5; i++ ) {
            for(j=1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
