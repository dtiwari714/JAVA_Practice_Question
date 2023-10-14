public class PalindromeString {
    public static void main(String[] args) {
        String a="ApA";
        String rev="";
        String org=a;

        int l=a.length();
        for(int i=l-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        if(org.equals(rev)){
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("THis is not palidrome");
        }
    }
}
