package RecursionPracticeProblem;

public class palindrome {
    public static void palin(int a, int rev){
        int org=a;
        if(a==0 && rev==org){
            System.out.println("Its a Palindrome");
            return;
        }else{
            System.out.println("Its not a Palindrome");
        }

        rev=rev*10+a%10;
        palin(a/10,rev);
    }
    public static void main(String[] args) {
        int a=2004;
        int rev=0;
        palin(a,rev);
    }
}
