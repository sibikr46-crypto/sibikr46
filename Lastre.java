public class Lastre {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,10};
        int n=num.length;
        boolean flage=false;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                    flage=true;
                    break;
                }
            }
        }
        
        }
    }


  