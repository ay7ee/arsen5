package Main;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle radius: ");
        double radius = sc.nextDouble();
        System.out.println("----------------------------");
        System.out.println(" ");
        System.out.println("Rectangle's parameters ");
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        anyInterface operation = (radius1) -> {
            double result = radius1 * radius1 * 3.14;
            return result;
        };
//        anyInterface obj1 = new anyInterface() {};
        System.out.println("Circle's area: " +operation.compute(radius));
        System.out.println("Rectangle's area: " +operation.calculate(length,width));

    }
}
