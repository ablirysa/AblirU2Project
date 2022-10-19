public class LinearEquation {
    // instance variables
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    // constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y2;
        this.y2 = y2;
    }

    // methods
    // method that calculates distance btwn points [will be rounded to hundredth]
    public double distance() {
        double sub = Math.pow((x2-x1), 2);
        double sub2 = Math.pow((y2-y1), 2);
        return Math.sqrt(sub + sub2);
    }

    // method that returns slope [will be rounded to hundredth]
    public double slope() {
        double num = y2 - y1;
        double den = x2 - x1;
        return num/den;
    }

    // method that returns y-intercept [will be rounded to hundredth]
    public double yIntercept() {
        double yInt = -1 * slope() * x1;
        yInt += y1;
        return yInt;
    }

    // method that returns the equation
    public String equation() {
        return " ";
    }

    // "helper" method that rounds to the nearest hundredth
    public double roundedToHundredth(double toRound) {
        toRound = (double) Math.round(toRound * 100) / 100;
        return toRound;
    }
}
