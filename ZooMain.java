package zoo;

public class ZooMain {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[] {
				
				new Lion ("bob",28,true),
				new Lion ("zob",18,false),
				new Elephant ("zed",67,1.5),
				new Elephant ("john",18,2.9),
				new Monkey ("tina",8,true),
				new Monkey("alex",10,false)
			
		};
		for (int i = 0;i< animals.length; i++) {
			Animal a = animals[i];
			a.displayInfo();
			a.makeSound();
			if(a instanceof Lion) {
				((Lion)a).hunt();
				
			}
			else if (a instanceof Elephant) {
				((Elephant)a).sprayWater();
			}
			else if (a instanceof Monkey) {
				((Monkey)a).swing();
			}
		}

	}

}
