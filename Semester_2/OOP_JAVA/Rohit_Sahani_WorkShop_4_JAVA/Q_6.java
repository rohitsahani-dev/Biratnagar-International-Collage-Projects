package Week_4;
//Create a final class FinalClass. Attempt to extend it with another class and observe the compiler error.
//Also, create a final method within a class and try to override it in a subclass.


final class FinalClass {
    void show() {
        System.out.println("Base class logic");
    }
}



class Parents {
    final void Action() {
        System.out.println("Parent's final action");
    }
}

class Children extends Parents {
// @Overridee
// void FinalClass() {
//	 System.out.println("Parent's final action");
// }
    void perform() {
        Action(); 
    }
}


  

   