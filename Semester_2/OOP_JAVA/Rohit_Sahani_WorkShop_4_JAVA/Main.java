package Week_4;
public class Main {
	public static void main(String[] args) {
//		1
				System.out.println("\nQuestion no 1");
		        Dog d = new Dog("Harry",3, "Labrador");
		        d.displayDog();
	    
//		2
	            System.out.println("\nQuestion no 2");
			    Circle myCircle = new Circle(25);
		        System.out.println("Perimeter : "+ myCircle.getPerimeter());
		        System.out.println("Area: "+myCircle.getArea());
//		3
		        System.out.println("\nQuestion no 3");
		        Doge myObj=new Doge("German",10,"labrador");
				myObj.show();
				System.out.println("To calculate area and perimeter of a circle");
		       
		        
//		4
				System.out.println("\nQuestion no 4");
		        Employee emp = new Employee("123 Java Lane", "IT");
		        emp.displayInfo();
		        
//		5
		        System.out.println("\nQuestion no 5");
		        Child obj = new Child();
		        obj.checkAccess();
		        
//		6
		        System.out.println("\nQuestion no 6");
		        Children myChild = new Children();
		        myChild.perform();
		   
//		7
		        System.out.println("\nQuestion no 7");
		        Calculator calc = new Calculator();
		        System.out.println("Sum of 5 and 8: " + calc.add(5, 8));
		        System.out.println("Sum of 10, 15, and 20: " + calc.add(10, 15, 20));
		        System.out.println("Sum of 3.5 and 2.7: " + calc.add(3.5, 2.7));
		        System.out.println("Sum of 1.1, 2.2, and 3.3: " + calc.add(1.1, 2.2, 3.3));
		    }
		
}
	