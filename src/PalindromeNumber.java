public class PalindromeNumber {
    public static void main(String[] args) {
        int a=1214;
        int org=a;
        int rev=0;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if(org==rev){
            System.out.println("this is palidrome");
        }
        else{
            System.out.println("this is not palidrome");
        }
    }
}
