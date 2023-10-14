public class CountEvenOROddInNumber {
    public static void main(String[] args) {
        int a=12345;
        int evencnt=0;
        int oddcnt=0;
        while(a>0){
            int num=a%10;
            if(num%2==0){
                evencnt++;
            }
            else{
                oddcnt++;
            }
            a=a/10;
        }
        System.out.println("Even number:"+evencnt+" "+"Odd Number:"+oddcnt);
    }
}
