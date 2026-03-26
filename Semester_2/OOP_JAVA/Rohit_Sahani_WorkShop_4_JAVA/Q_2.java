package Week_4;
//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
//Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

class Shape {
    double getPerimeter() {
        return 0;
    }
    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override 
    double getArea() {
        return 3.14 * radius * radius;
    }

    @Override 
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}


