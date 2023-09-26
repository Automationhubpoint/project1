 package interviewQuesrtions;

 
	
	
	class parentclass {
	    public   void nonstaticMethod() {
	        System.out.println("Superclass static method");
	        
	        
	    } 
	    
	    
	    public void method() 
	    {
	    	System.out.println("parent method");
	    }
	}

	class childclass extends parentclass {
	    public   void nonstaticMethod() {
	        System.out.println("Subclass static method");
	    }
	}

	public class overidingNonstaticexample {
		
		
	    public static void main(String[] args) {
	         

	        parentclass superClassReference = new parentclass();
	        superClassReference.nonstaticMethod(); // Calls the Superclass static method (compile-time resolution)
	    
	        childclass subClassReference = new childclass();
	        subClassReference.nonstaticMethod();
	        parentclass parentclassReference = new  childclass();
	        
	        parentclassReference.nonstaticMethod();
	        
	        childclass  childclassReference = (childclass)superClassReference;
	        
	        childclassReference.method();
	         
	    }
	    
	}




