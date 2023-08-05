/**
 * <i>Geometric figure circle</i>
 * <i>extends {@link Shape}</i>
 */

class Circle extends Shape {
    private double radius;

    /**
     * <i>Constructor {@link  Circle} geometric figure</i>
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * <i>Calculates the area of a {@link Circle}</i>
     * @return return Math.PI * radius * radius;
     */
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * <i>Calculates the perimeter of a {@link Circle}</i>
     * @return 2 * Math.PI * radius;
     */

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}