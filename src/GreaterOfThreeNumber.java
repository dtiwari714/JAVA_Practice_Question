public class GreaterOfThreeNumber {
    public static void main(String[] args) {
        int a=50;
        int b=20;
        int c=30;

        int max=a;
        if(b>max && b>c)
        {
            System.out.println("B is grater than A and C");
        }
        else if (c>max && c>max)
        {
            System.out.println("C is grater than A And B");
        }
        else{
            System.out.println("A is maximum");
        }
    }
}
