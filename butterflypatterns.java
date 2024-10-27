public class butterflypatterns {
    public static void main(String[] args) {
        int i, j;
        int n=4;
        //First half

        for(i = 1; i<= n; i++) {
            for(j=1; j<=i; j++) {
                System.out.print("*"); 
            }
            for(j=1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
        //second half
        for(i = n; i>= 1; i--) {
            for(j=1; j<=i; j++) {
                System.out.print("*"); 
            }
            for(j=1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}