package learningJavaLanguage.advancedClasses.nested;

public class Nested {

	// Nested classes are divided into two categories: static and non-static.
	// Nested classes that are declared static are called static nested classes.
	// Non-static nested classes are called inner classes.


    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Nested.this.x = " + Nested.this.x);
        }
    }

    public static void main(String... args) {
    	Nested ns = new Nested();
    	Nested.FirstLevel fl = ns.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
    
}