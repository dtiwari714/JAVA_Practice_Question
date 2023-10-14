import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Swapping...");
        System.out.println("a: ");
        int a=sc.nextInt();
        System.out.println("b: ");
        int b=sc.nextInt();

        /*Using Third Variable*/
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After Swapping using Third Variable....");
//        System.out.println("a: "+a+" "+"b: "+b);

        /*Using only two variable*/
//        a=b+a;
//        b=a-b;
//        a=a-b;
//        System.out.println("After Swapping using Two Variable....");
//        System.out.println("a: "+a+" "+"b: "+b);

        //one line swapping
        b=a+b-(a=b);
        System.out.println("a: "+a+" "+"b: "+b);


    }
}
