package RecursionPracticeProblem;

public class Print5to1 {
    public static void reversenumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        reversenumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        reversenumber(n);
    }
}
