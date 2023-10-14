package OppsInJava.Interface;
interface a{
    void display();
}
interface b{
    void display();
}
class C implements a,b{
    @Override
    public void display() {
        System.out.println("display");
    }
}

public interface Interface {
    public static void main(String[] args) {
        C di=new C();
        di.display();
    }
}
