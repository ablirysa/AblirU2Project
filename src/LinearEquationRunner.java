import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");

        // coordinate 1
        System.out.print("Enter Coordinate 1: ");
        String co1 = scan.nextLine();
        int x1 = Integer.parseInt(co1.substring(co1.indexOf("(") + 1, co1.indexOf(",")));
        int y1 = Integer.parseInt(co1.substring((co1.indexOf(", ") + 2), co1.indexOf(")")));

        // coordinate 2
        System.out.print("Enter Coordinate 2: ");
        String co2 = scan.nextLine();
        int x2 = Integer.parseInt(co2.substring(co2.indexOf("(") + 1, co2.indexOf(",")));
        int y2 = Integer.parseInt(co2.substring((co2.indexOf(", ") + 2), co2.indexOf(")")));

        // creating an obj
        LinearEquation cords = new LinearEquation(x1, y1, x2, y2);

        // printing out the info
        System.out.println();
        System.out.println(cords.lineInfo());

        // point on the line
        if (cords.equation().indexOf("x =") == -1) {
            System.out.println();
            System.out.print("Enter a value for x: ");
            double xVal = scan.nextDouble();
            System.out.println();
            System.out.println("The point on the line is " + cords.coordinateForX(xVal));
        }
    }
}
