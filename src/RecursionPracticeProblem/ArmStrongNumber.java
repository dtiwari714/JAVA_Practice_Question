package RecursionPracticeProblem;

public class ArmStrongNumber {
    public static int armStrong(int n,int rem,int cube){
        int org=n;
        if (n==0){
            return cube;
        }
        rem=n%10;
        cube=cube+rem*rem*rem;
        int ans=armStrong(n/10,rem,cube);
        //System.out.println(cube);
        return ans;
    }
    public static void main(String[] args) {
        int n=156;
        int org=n;
        int ans=armStrong(n,0,0);
        System.out.println(ans);
        if(org==ans){
            System.out.println("Its a Armsstrong");
        }
        else{
            System.out.println("Its not a Armstrong");
        }


    }
}
