//8. Implement a no-argument constructor that prints out “User created!” as soon as the instance of the user is created.
package Week_3;

class User {

    public User() {
        System.out.println("User created!");
    }
}

public class Q_8 {
    public static void main(String[] args) {
        User myObj = new User(); 
    }
}