// An interface used to demonstrate Anonymous Classes later
interface Greeting {
    void sayHello();
}

// The Outer Class
public class Main {

    // ACCESS MODIFIERS (Instance variables with different visibility)
    public String publicVar = "I am Public (accessible anywhere).";
    protected String protectedVar = "I am Protected (accessible in package & subclasses).";
    String defaultVar = "I am Default/Package-Private (accessible in this package only).";
    private String privateVar = "I am Private (accessible ONLY inside Main).";

    // NESTED CLASS TYPE A: Static Nested Class
    // It acts like a regular top-level class but is grouped inside Main.
    // It can ONLY access static members of the outer class directly.
    public static class StaticNestedClass {
        public void display() {
            System.out.println("\n--- Inside Static Nested Class ---");
            System.out.println("I can be created without making an Outer class object first.");
        }
    }

    // NESTED CLASS TYPE B: Inner Class (Non-Static Nested Class)
    // It is tied directly to an instance of the outer class.
    // Crucial rule: It can access ALL private variables of the Outer class
    public class InnerClass {
        public void accessOuterMembers() {
            System.out.println("\n--- Inside Member Inner Class ---");
            System.out.println("Accessing Outer Class Private Variable: " + privateVar);
            System.out.println("Accessing Outer Class Public Variable: " + publicVar);
        }
    }

    // The Main method to execute the code
    public static void main(String[] args) {
        
        // --- Testing Access Modifiers & Outer Class ---
        Main outerObj = new Main();
        System.out.println("Outer Object Values:");
        System.out.println(outerObj.publicVar);
        System.out.println(outerObj.privateVar); // Works here because we are still inside Main

        // --- Instantiating the Static Nested Class ---
        // Syntax: OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
        Main.StaticNestedClass staticNestedObj = new Main.StaticNestedClass();
        staticNestedObj.display();

        // --- Instantiating the Inner Class ---
        // Syntax: Needs an instance of the outer class first
        Main.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.accessOuterMembers();

        // ANONYMOUS CLASS
        // We create a one-time use class on the fly that implements the Greeting interface.
        // It has no class name, which is why it is called "anonymous".
        Greeting anonymousObj = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("\n--- Inside Anonymous Class ---");
                System.out.println("Hello from an Anonymous Class implementation!");
            }
        }; // Must end with a semicolon
        
        // Calling the method on the anonymous object
        anonymousObj.sayHello();
    }
}
