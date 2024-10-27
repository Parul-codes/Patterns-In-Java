public class halfpyramid {
    public static void main(String[] args) {
        int i,j;
        int n =5;
        for(i=1; i<=n; i++) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        //inverted half pyramid
        for(i=n; i>=1; i--) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}