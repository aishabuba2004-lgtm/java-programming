class Shape {
    double area() {
        return 0;
    }
}
class Circle extends Shape {
    double radius = 5;
    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length = 8;
    double width = 9;
    double area() {
        return length * width;
    }
}
class Triangle extends Shape {
    double base = 6;
    double height = 7;
    double area() {
        return 0.5 * base * height;
    }
}
class TestShape {
    public static void main(String[]args) {
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle(),};
        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}