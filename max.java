public class max {
   
    public static void main(String[] args) {
        int[] numbers = {15, 42, 4,100, 23, 7};
        
        
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("The maximum element is: " + max);
    }
}

    

