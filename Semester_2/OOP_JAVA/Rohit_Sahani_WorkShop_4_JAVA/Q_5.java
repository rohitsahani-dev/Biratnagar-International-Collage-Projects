package Week_4;


class Parent {
    private String privateVar = "Private Value";
    protected String protectedVar = "Protected Value";
    public String publicVar = "Public Value";

    public String getPrivateVar() {
        return privateVar;
    }
}

class Child extends Parent {
    void checkAccess() {
        System.out.println(publicVar); 
        System.out.println(protectedVar); 
        System.out.println(getPrivateVar()); 
    }
}

        
  
 