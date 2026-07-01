public class removespacesinstring {
    public static void main(String[] args) {
        String str = "harishan is a gay .";
        String strWithoutSpaces = str.replaceAll("gay", "harishan");
        System.out.println("String without spaces: " + strWithoutSpaces);
    }

    
}
