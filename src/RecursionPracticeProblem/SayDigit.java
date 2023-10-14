package RecursionPracticeProblem;

import java.util.Arrays;

public class SayDigit {
    public static void digit(int n,String arr[]){
        if(n==0){
            return;
        }
        int dig=n%10;
        n=n/10;
        digit(n,arr);

        System.out.print(arr[dig]+" ");
        return;

    }
    public static void main(String[] args) {
       String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
       int n=412;
       digit(n, arr);
    }
}
