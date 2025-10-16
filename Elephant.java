package zoo;

public class Elephant extends Animal {
    private  double trunkLength;

    public Elephant (String name, int age, double trunkLength ) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    public void sprayWater() {
    	System.out.println(name + "sprayWater with length" + trunkLength);
    	 
            }
	    }
	


