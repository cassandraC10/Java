package OOP;

public class PetTest {
    public static void main(String[] args) {

        Pet myDog = new Dog();
        myDog.setName("Jack Sparrow");
        System.out.println(myDog.getName());
        System.out.println(myDog.speak());

        Pet myCat = new Cat();
        myCat.setName("Angela Tom");
        System.out.println(myCat.getName());
        System.out.println(myCat.speak());

    }
}
