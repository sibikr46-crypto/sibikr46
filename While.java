import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();
        int count = 0;
        while(a>0){
            a=a/10;
            count=count+1;
        }
        System.out.println(count);
    }
}
