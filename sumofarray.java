import java.util.*;
public class sumofarray { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n=new int[5];
        int[] m=new int[4];
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }
        int[][] num = new int[sum][sum];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
            }
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
