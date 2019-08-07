import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double x1 = quadraticEquation.getRoot1();
        double x2 = quadraticEquation.getRoot2();
        String display = quadraticEquation.display();
        if (delta >= 0) {
            System.out.println(display + " co 2 nghiem: ");
            System.out.print("x1 = " + x1);
            System.out.print(", x2 = " + x2);
        } else if (delta == 0) {
            System.out.println(display + " co 1 nghiem: ");
            System.out.print("x1 = x2 = " + x1);
        } else {
            System.out.println(display + " vo nghiem");
        }
    }
}
