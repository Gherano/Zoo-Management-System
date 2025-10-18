package zoo;

public class Lion extends Animal{
	
	private boolean isAlpha; 
	
    public Lion(String name , int age,boolean isAlpha ) 
    {
    	super(name,age);
        this.isAlpha=isAlpha;
		
	}
    
    @Override 
    public void makeSound() {
    	System.out.println("Roar!");
    	
    }
    public void hunt() {
    	if(isAlpha) {
    		System.out.println(name + "hunt"); 
    	
    	}
    	else {
    		System.out.println(name+ "don't hunt");
    	}
    }
}
