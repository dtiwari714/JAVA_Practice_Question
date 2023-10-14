package RecursionPracticeProblem;

public class Print1to5 {
    public static void printnumber(int a,int b) {
        int n=0;
        if(n==b){
            return;
        }
        System.out.println(a);
        printnumber(a+1,b-1);

    }
    public static void main(String[] args) {
        int a=1;
        int b=6;
        printnumber(a,b);
    }
}
