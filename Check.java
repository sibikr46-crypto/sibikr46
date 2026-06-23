import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          char  a=input.next().charAt(0);
          if (a>='A' && a<='Z'){
            System.out.println("print its is upper case");
          }
          else if(a>='a' && a<='z'){
           System.out.println("print its is lower case");
          }
           else if (a>='0' && a<='9'){
             System.out.println("print its is digit");
             
           }
           else {
            System.out.println("print its is special character");
           }
    }
    
}
