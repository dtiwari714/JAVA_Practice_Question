package RecursionPracticeProblem;

public class SumofNnaturalnumber {
    public static void sumofnatural(int a,int sum){
        if(a==0){
            System.out.println(sum);
            return;
        }
        sum=sum+a;
        System.out.println(sum);
        sumofnatural(a-1,sum);
    }
    public static void main(String[] args) {
        int a=6;
        int sum=0;
        sumofnatural(a,sum);
    }
}
