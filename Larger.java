import java.util.Scanner;

public class Larger {
    public static void main (String[]arg){
         Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if (a>b && a>c){
            System.out.println("print a is greater");

        }
        else if (b>a && b>c){
            System.out.println("print b is great");
        }
        else{
            System.out.println("c is greater");
        }

    }
    
}
