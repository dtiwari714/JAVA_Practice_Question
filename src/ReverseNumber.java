public class ReverseNumber {
    public static void main(String[] args) {
        int a=1234;
        int rev=0;
        //This is the First method
        /*while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        System.out.println("The Number After Reverse:"+rev);*/

        //@2nd Method
        StringBuffer sb=new StringBuffer(String.valueOf(a));
        StringBuffer reverse=sb.reverse();
        System.out.println("The number after reverse:"+reverse);

    }
}
