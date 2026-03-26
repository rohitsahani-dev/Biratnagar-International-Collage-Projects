package Week_4;
//Create a class Person with a protected attribute address. 
//Extend it with a subclass Employee that adds a department attribute.
//Demonstrate how the protected keyword allows access to the address property in the Employee subclass.

class Person {
    protected String address;
    
    Person(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    String department;

    Employee(String address, String department) {
        super(address);
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Department: " + department);
        System.out.println("Address: " + address); 
    }
}


       