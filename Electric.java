import java.util.Scanner;

public class electric {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
         
        if(a<=100){
            System.out.println(a*2);
        }
        else if(a>100 && a>=200){
            System.out.println(200+(a-100)*3);
        }
        else{
            System.out.println();
        }
    } }