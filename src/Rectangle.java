/**
 * <i>Geometric figure rectangle</i>
 * <i>extends {@link Shape}</i>
 */

class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * <i>Constructor {@link Rectangle} geometric figure</i>
     * @param length
     * @param width
     */

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * <i>Calculates the area of a {@link Rectangle}</i>
     * @return return length * width
     */
    @Override
    double getArea() {
        return length * width;
    }

    /**
     * <i>Calculates the perimeter of a {@link Rectangle}</i>
     * @return return 2 * (length + width)
     */

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}