package RecursionPracticeProblem;

public class factorial {
    public static void fact(int a,int fact){
        if(a==0){
            System.out.println(fact);
            return;
        }
        fact=fact*a;
        fact(a-1,fact);

    }
    public static void main(String[] args) {
        int a=5;
        fact(a,1);
    }
}
