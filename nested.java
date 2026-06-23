import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       for(int a=1;a<=n;a++){
        for(int i=1;i<=a;i++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    
}
}