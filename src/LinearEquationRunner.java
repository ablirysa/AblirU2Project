import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");

        // coordinate 1
        System.out.print("Enter Coordinate 1: ");
        String co1 = scan.nextLine();
        int whereComma = co1.indexOf(",");
        int co1len = co1.length();
        String p1 = co1.substring(1, whereComma);
        String p2 = co1.substring((whereComma + 2), (co1len - 1));
        int x1 = Integer.parseInt(p1);
        int y1 = Integer.parseInt(p2);

        // coordinate 2
        System.out.print("Enter Coordinate 2: ");
        String co2 = scan.nextLine();
        int whereComma2 = co1.indexOf(",");
        int co2len = co2.length();
        String p3 = co2.substring(1, whereComma2);
        String p4 = co2.substring((whereComma2 + 2), (co2len - 1));
        int x2 = Integer.parseInt(p3);
        int y2 = Integer.parseInt(p4);

        // creating an obj
        LinearEquation cords = new LinearEquation(x1, y1, x2, y2);
    }
}
