// 4.Create an object of this class and initialize its attributes.

package Week_3;
class UserInfo {
    String fullName;
    int years;

    public UserInfo(String name, int age) {
        this.fullName = name;
        this.years = age;
    }
}

public class Q_4 {
    public static void main(String[] args) {
  
        UserInfo person = new UserInfo("Rohit Sahani", 20);

        System.out.println("Name: " + person.fullName);
        System.out.println("Age: " + person.years);
    }
}
