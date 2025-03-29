package Q_03;

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircularRegionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the inner circle (ri): ");
        double innerRadius = scanner.nextDouble();

        System.out.print("Enter the radius of the outer circle (ro): ");
        double outerRadius = scanner.nextDouble();

        Circle innerCircle = new Circle(innerRadius);
        Circle outerCircle = new Circle(outerRadius);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();
        double ringArea = outerArea - innerArea;

        System.out.println("\nResults:");
        System.out.printf("Inner circle radius: %.2f%n", innerRadius);
        System.out.printf("Inner circle area: %.2f%n", innerArea);
        System.out.printf("Outer circle radius: %.2f%n", outerRadius);
        System.out.printf("Outer circle area: %.2f%n", outerArea);
        System.out.printf("Area of the circular region (ring): %.2f%n", ringArea);
        System.out.printf("Inner circle circumference: %.2f%n", innerCircle.computeCircumference());
        System.out.printf("Outer circle circumference: %.2f%n", outerCircle.computeCircumference());

        scanner.close();
    }
}
