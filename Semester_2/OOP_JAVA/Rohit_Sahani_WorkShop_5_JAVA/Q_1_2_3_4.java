package Week_5;
abstract class Shape{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
class Quadrilateral extends Shape{
	double length;
	double breath;
	Quadrilateral(double length , double breadth){
		this.length = length;
		this.breath = breadth;
		
	}
	@Override
	 void calculateArea() {
	 double area = length * breath;
	 System.out.println("Area of quadrilateral is : "+area);
	}
	@Override
	 void calculatePerimeter() {
		 double perimeter = 2*(length+breath);
		 System.out.println("Area of quadrilateral is : "+perimeter);
	}
}

public class Q_1_2_3_4 {
	public static void main(String[] args) {
		Quadrilateral q = new Quadrilateral(6,8);
		q.calculateArea();
		q.calculatePerimeter();
	}
}
