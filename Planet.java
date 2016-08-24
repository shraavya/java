
public class Planet {
	private String name;
	private int population;
	public Planet(String pName){
		name = pName;
		population = 0;
	}
	public Planet(String pName,int pop){
		name = pName;
		population = pop;
	}
	
	public int predictPopulation(int years){
		int popFuture;
		popFuture = (int) (population * Math.pow(2,years));
		return popFuture;
		
	}
	
	public static void main(String args[]){
		Planet earth = new Planet("Earth", 20);
		Planet pluto = new Planet("Pluto");
		Planet mars = new Planet("Mars", 1);
		
		System.out.println("Popluation of earth 10 years from now is " + earth.predictPopulation(10));
		System.out.println("Popluation of pluto 10 years from now is " + pluto.predictPopulation(10));
		System.out.println("Popluation of mars 10 years from now is " + mars.predictPopulation(10));
	}

}
