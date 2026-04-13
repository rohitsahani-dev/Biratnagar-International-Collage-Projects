package Week_5;
interface Animal {
    void eat();
    void walk();
}

interface Printable {
    void display();
}

class Cow implements Animal, Printable {
    @Override
    public void eat() {
        System.out.println("Cow eats grass.");
    }

    @Override
    public void walk() {
        System.out.println("walking in fields.");
    }

    @Override
    public void display() {
        System.out.println("Cow details");
    }
}

public class Q_7_8_9 {
    public static void main(String[] args) {
        Cow myObj = new Cow();
        myObj.eat();
        myObj.walk();
        myObj.display();
    }
}


	

