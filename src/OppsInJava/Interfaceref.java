package OppsInJava;

interface A{
    default void display(){
        System.out.println("hello");
    }
}
class Be implements A{
    public void display(){
        System.out.println("jii");
    }
}
public class Interfaceref {
    public static void main(String[] args) {
        Be se=new Be();
        se.display();
    }

}
