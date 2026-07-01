import java.util.Scanner;

public class whilereverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while(a > 0) {
            int digit = a % 10;
            System.out.print(digit);
            a = a / 10;
        }
    }
}