class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getR() {
        return radius;
    }

    public void setR(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Area());
        System.out.println("Circumference: " + Circumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7.0);
        c1.print();

        c1.setR(10.0);
        System.out.println("\nAfter modifying radius:");
        c1.print();
    }
}


// Output
// Radius: 7.0
// Area: 153.93804002589985
// Circumference: 43.982297150257104
// After modifying radius:
// Radius: 10.0
// Area: 314.1592653589793
// Circumference: 62.83185307179586