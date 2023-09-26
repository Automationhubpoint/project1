package interviewQuesrtions;

 
	
	
	class Superclass {
	    public static void staticMethod() {
	        System.out.println("Superclass static method");
	    }
	}

	class Subclass extends Superclass {
	    public static void staticMethod() {
	        System.out.println("Subclass static method");
	    }
	}

	public class OveridingStaticExample {
		
		
	    public static void main(String[] args) {
	        Superclass.staticMethod(); // Calls the Superclass static method
	        Subclass.staticMethod();    // Calls the Subclass static method

	        Superclass superClassReference = new Subclass();
	        superClassReference.staticMethod(); // Calls the Superclass static method (compile-time resolution)
	    
	        Subclass subClassReference = new Subclass();
	        
	        subClassReference.staticMethod();
	    }
	    
	}



