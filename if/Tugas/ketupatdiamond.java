public class ketupatdiamond{
    public static void main(String[] args) {
        int n = 5; 
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }   
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n - 2; i >= 0; i--) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}