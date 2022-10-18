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
        int x1 =
    }
}
