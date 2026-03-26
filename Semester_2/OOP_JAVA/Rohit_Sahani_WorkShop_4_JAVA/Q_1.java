package Week_4;
//Create a class Animal with properties like name and age. 
//Create a subclass Dog that inherits from Animal and adds a property breed. 
//Demonstrate the use of constructors in both the Animal and Dog classes.

class Animal {
    String name;
    int age;

    Animal() {
    }

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String n, int a, String b) {
        this.name = n;
        this.age = a;
        this.breed = b;
    }

    void displayDog() {
        displayAnimal();
        System.out.println("Breed: " + breed);
    }
}

      
