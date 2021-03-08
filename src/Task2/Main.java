package Task2;
import java.util.Scanner;
public class Main {


    public static void main(String[] args)  {


        try {
            Class cls = Class.forName("Task2.test");
            test a = (test) cls.newInstance();
            System.out.println(a.exss());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
}

class test  {

    Scanner sc = new Scanner(System.in);
    private int x = sc.nextInt();
    private int y = sc.nextInt();

    public int exss() {
        int i = x * y;
        return i;
    }

}
