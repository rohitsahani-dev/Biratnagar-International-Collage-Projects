package Week_5;
abstract class Vehicle {
    abstract void wheel();
    void door() {
        System.out.println("This is a vechile door.");
    }
}

class Bus extends Vehicle {
    @Override
    void wheel() {
        System.out.println("It has 6 large wheel.");
    }
}

public class Q_5_6 {
    public static void main(String[] args) {
        Bus myObj = new Bus();
        myObj.wheel();
        myObj.door();
    }
}



