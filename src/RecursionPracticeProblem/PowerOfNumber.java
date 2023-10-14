package RecursionPracticeProblem;

public class PowerOfNumber {
    public static int power(int base,int powe,int result){
        if(powe==0){
            //System.out.println("1");
            return 1;
        }
        if(base==0){
            //System.out.println("0");
            return 0;
        }
        result=base*power(base,powe-1,result);
        return result;
    }
    public static void main(String[] args) {
        int base=2;
        int pow=3;
        int result=0;
        int ans=power(base,pow,result);
        System.out.println(ans);
    }
}
