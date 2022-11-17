abstract class parent {

    abstract void message();

}
class First extends parent {
    void message() {
        System.out.println("This is first subclass");

    }
}
    class Second extends parent {
    void message() {
        System.out.println("this is second subclass");

    }
}
public class main5{
    public static void main(String args[])
    {
        First first =new First();
        first.message();
        Second second =new Second();
        second.message();
    }

}