public class hollowrhombus {
    public static void main(String[] args) {
        int i, j, n=5;
        for(i=1; i<=n; i++) {
            for(j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            if(i==1 || i==n) {
                for(j=1; j<=n; j++) {
                    System.out.print("* ");
                }
            } 
            else {
                for(j=1; j<=1; j++) {
                    System.out.print("* ");
                }
                for(j=2; j<=4; j++) {
                    System.out.print("  ");
                }
                for(j=1; j<=1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
