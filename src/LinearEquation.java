public class LinearEquation {
    // instance variables
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    // constructor
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    // methods
    // method that calculates distance btwn points [will be rounded to hundredth]
    public double distance() {
        double sub = Math.pow((x2-x1), 2);
        double sub2 = Math.pow((y2-y1), 2);
        return roundedToHundredth(Math.sqrt(sub + sub2));
    }

    // method that returns slope [will be rounded to hundredth]
    public double slope() {
        double num = y2 - y1;
        double den = x2 - x1;
        return roundedToHundredth(num/den);
    }

    // method that returns y-intercept [will be rounded to hundredth]
    public double yIntercept() {
        double yInt = -1 * slope() * x1;
        yInt += y1;
        return roundedToHundredth(yInt);
    }

    // method that returns the equation
    public String equation() {
        int num = y2 - y1;
        int den = x2 - x1;
        String slope;
        boolean negY;
        boolean origin;

        if (yIntercept() == 0) {
            origin = true;
            negY = false;
        } else if (yIntercept() == Math.abs(yIntercept())) {
            negY = false;
            origin = false;
        } else {
            negY = true;
            origin = false;
        }

        if (x1 == x2) {
            return "undefined";
        }
        if (y1 == y2) {
            return "y = " + yIntercept();
        }

        if (num < 0 && den < 0) {
            slope = (-1 * num) + "/" + (-1 * den) + "x";
        } else if (num > 0 && den < 0) {
            slope = "-" + num + "/" + (-1 * den) + "x";
        } else if (num < 0 && den > 0) {
            slope = num + "/" + den + "x";
        } else if (num > 0 && den > 0) {
            slope = num + "/" + den + "x";
        } else if (((double) num/den) == -1) {
            slope = "-x";
        } else {
            slope = "x";
        }

        if (negY) {
            return "y = " + slope + "-" + Math.abs(yIntercept());
        } else if (origin) {
            return "y = " + slope;
        } else {
            return "y = " + slope + " + " + yIntercept();
        }
    }

    // method that returns the coordinate value at certain x
    public String coordinateForX(double xValue) {
        double part1 = slope() * xValue + yIntercept();
        return "(" + part1 + ", " + xValue + ")";
    }

    // "helper" method that rounds to the nearest hundredth
    public double roundedToHundredth(double toRound) {
        toRound = (double) Math.round(toRound * 100) / 100;
        return toRound;
    }

    // returns a string that includes all info
    public String lineInfo() {
        String str = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " +  y2 + ")";
        str += "\nThe equation of the line between the points is: " + equation();
        str += "\nThe slope of this line is: " + slope();
        str += "\nThe y-intercept of the line is: " + yIntercept();
        str += "\nThe distance between the two points is: " + distance();
        return str;
    }
}
