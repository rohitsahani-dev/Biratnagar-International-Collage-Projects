//9. Create a class named ,”Box” with attributes width, height, and depth. 
//Create multiple constructors for handling following object declarations. 
//Also declare a method getVolume() that prints the  volume of the declared:
//For a cube, declare a constructor to take length only.
//For a cuboid, declare a constructor to take length, breadth, and height.
//For no parameter, declare a no-argument constructor that sets length = 10, breadth = 8, and height = 12.

package Week_3;

class Box {
    private double width;
    private double height;
    private double depth;

    
    public Box() {
        this.width = 10;
        this.height = 12;
        this.depth = 8;
    }

    
    public Box(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    
    public void getVolume() {
        double volume = width * height * depth;
        System.out.println("Volume: " + volume);
    }
}

public class Q_9 {
    public static void main(String[] args) {
        
        Box box = new Box();
        box.getVolume();  

       
        Box cube = new Box(12);
        cube.getVolume();  

        
        Box cuboid = new Box(3, 4, 5);
        cuboid.getVolume();  
    }
}
