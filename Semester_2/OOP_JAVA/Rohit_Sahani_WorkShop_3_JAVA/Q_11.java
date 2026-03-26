//11.Create a class Address with private attributes street, city, and zipCode. Use encapsulation and provide getter and setter methods.
package Week_3;

class Address {
    private String street;
    private String city;
    private String zipCode;

    
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

   
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

public class Q_11 {
    public static void main(String[] args) {
        Address myObj = new Address();
      
        myObj.setStreet("laliguras tole");
        myObj.setCity("Biratnagar");
        myObj.setZipCode("42600");

        System.out.println("Street: " + myObj.getStreet());
        System.out.println("City: " + myObj.getCity());
        System.out.println("Zip Code: " + myObj.getZipCode());
    }
}