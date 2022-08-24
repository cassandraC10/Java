package ChapterThree;
// No 3.5. The Keyword new creates a new object of it's specified class

//(Default Constructors) A class declares a constructor that takes two parameters. How would
//you create an instance of the class with no parameters

public class DefaultConstructor {
    public DefaultConstructor(int breadth, int width) {
        // An example of a class constructor that takes two parameters
    }

    public DefaultConstructor() {
    }
    // An example of a class constructor that takes no parameters

    public static void main(String[] args) {
        int breadth = 0;
        int width = 0;
        DefaultConstructor jenniferDc = new DefaultConstructor(breadth, width);

// A constructor with no parameters
        DefaultConstructor sandraDc = new DefaultConstructor();
    }

}


//No. 3.7. The purpose of an instance variable
   // private String Food;         // an example of an instance variable
    // an instance variable is always written inside the class but
    // before the object's method unlike the local variable, because it can be used multiple times
    // by different methods in the same class.

// No. 3.8 (Using Classes without Importing Them)
    //Ans = String and System are built in functions that can be imported implicitly.

// No. 3.9 (Using a Class without Importing It)
    // by calling the class method anytime it wants to use it.

// No. 3.10 (set and get Methods)
    // without a setter: it is hard to update or change the variable value
    // without a getter: it can be hard to read the variable value.

// No. 3.11 (Modified Account Class)
    // new class


