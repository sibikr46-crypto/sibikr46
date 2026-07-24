 public class equillibrium {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        int totalSum = 0; 
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        boolean foundEquilibrium = false;
 
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; 

            if (leftSum == totalSum) {
                System.out.println("Equilibrium index found at: " + i);
                foundEquilibrium = true;
                break;
            }

            leftSum += arr[i];
        }

        if (!foundEquilibrium) {
            System.out.println("No equilibrium index found.");
        }
    } 
    
}
