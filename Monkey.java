package zoo;

public class Monkey extends Animal{
	
	private boolean canClimb; 
	
    public Monkey(String name , int age,boolean canClimb ) 
    {
    	super(name,age);
        this.canClimb = canClimb;
		
	}
    
    @Override 
    public void makeSound() {
    	System.out.println("Oo-oo-aa-aa!");
    	
    }
    public void swing() {
    	if(canClimb) {
    		System.out.println(name + "swing"); 
    	
    	}
    	else {
    		System.out.println(name+ "can't swing");
    	}
    }
}

