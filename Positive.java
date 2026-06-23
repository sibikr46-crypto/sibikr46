import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        
        if(a>0){
            System.out.println("a is positive");
        }
        else if (a<0){
            System.out.println("b is negative");
        }
        else {
            System.out.println("it is zero");
        }
    }
    
}
