import java.util.Scanner;
class Palindrome {
    public static boolean isPalindrome(String str) {
       int n=str.length();
       for(int i=0;i<n/2;i++){
           if(str.charAt(i)!=str.charAt(n-i-1)){
               return false;
           }
       }
       return true;
    
}
public static void main(String[]args){
   Scanner in=new Scanner(System.in);
   String s=in.next();
   if(isPalindrome(s)){
       System.out.println("palindrome");

   }
   else{
       System.out.println("not palindrome");
   }
}
}
