package RecursionPracticeProblem;

public class Fibonaaci {
    public static void fibo(int a,int b,int c){
        if(c==0){
            return;
        }
        System.out.println(a);
        fibo(b,a+b,c-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        fibo(a,b,7);
    }
}
