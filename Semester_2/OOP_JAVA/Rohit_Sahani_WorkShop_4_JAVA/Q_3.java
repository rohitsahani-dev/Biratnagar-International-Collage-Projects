package Week_4;
//Extend the Animal and Dog example by adding a constructor to the Animal class that takes a name parameter. 
//In the Dog class, use the super keyword to call the constructor of the Animal class. 
//Create instances of Dog and demonstrate the use of the super keyword.

class Animals {
    String name;
    int age;

  
    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}


class Doge extends Animals {
    String breed;

    Doge(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void show() {
        display(); 
        System.out.println("Breed: " + breed);
    }
}

