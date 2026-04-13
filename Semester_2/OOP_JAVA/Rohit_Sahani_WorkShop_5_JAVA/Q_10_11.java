package Week_5;

interface LivingBeing {
    void specialFeature();
}

class Cows implements LivingBeing {
    public void specialFeature() {
        System.out.println("This featured worked properly");
    }
}
public class Q_10_11 {
    public static void main(String[] args) {
        Cows c = new Cows();
        c.specialFeature();
    }
}



