/**
 * <i>Geometric figure triangle</i>
 * <i>extends {@link Shape}</i>
 */

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;


    /**
     * <i>Constructor {@link  Triangle} geometric figure</i>
     * @param side1 <i>one side of a triangle</i>
     * @param side2 <i>one side of a triangle</i>
     * @param side3 <i>one side of a triangle</i>
     */

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    /**
     * <i>Calculates the area of a {@link Triangle}</i>
     * @return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
     */

    @Override
    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * <i>Calculates the perimeter of a {@link Triangle}</i>
     * @return side1 + side2 + side3
     */

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}