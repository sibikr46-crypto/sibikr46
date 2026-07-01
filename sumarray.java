import java.util.Scanner; 

public class sumarray { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter the number of elements in the array"); 
        int n = in.nextInt(); 
        int[] arr = new int[n]; 
        
        System.out.println("Enter the elements:");
        for(int i = 0; i < arr.length; i++){ 
            arr[i] = in.nextInt(); 
        } 
        
        System.out.println("Your array elements are:");
        for(int i = 0; i < arr.length; i++){ 
            System.out.print(arr[i] + " "); 
        }
        
        in.close(); 
    } 
}
