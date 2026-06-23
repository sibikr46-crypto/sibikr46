import java.util.Scanner;

public class nested1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a = n; a >= 1; a--) {
            for (int s = 0; s < n - a; s++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= a; i++) {
                System.out.print(" @");
            }
            System.out.println();
        }
        
    }
}
