package Week_5;

interface LivingBeings {
    void specialFeature();
}

class Fish implements LivingBeings {
	@Override
    public void specialFeature() {
        System.out.println("Fish can breathe underwater .");
    }
}

class Bird implements LivingBeings {
	@Override
    public void specialFeature() {
        System.out.println("Birds can fly.");
    }
}

public class Q_12_13 {
    public static void main(String[] args) {
       Fish myfish = new Fish();
       Bird mybird = new Bird();
       myfish.specialFeature();
       mybird.specialFeature();
    }
}




