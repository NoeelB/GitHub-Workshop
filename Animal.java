package animal;

public class Animal {
	private int numLegs;
	private boolean hasFur;
	private String name;
	private String species;
	public Animal(String name){
		this.name = name;
		hasFur = false;
		numLegs = 0;
		species = "Unknown";
	}
	public Animal(String name, String species,
			int numLegs, boolean hasFur){
		this.name = name;
		this.species = species;
		this.numLegs = numLegs;
		this.hasFur = hasFur;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getNumLegs(){
		return numLegs;
	}
	public void setNumLegs(int num){
		numLegs = num;
	}
	public boolean getHasFur(){
		return hasFur;
	}
	
	public String getSpecies(){
		return species;
	}
	
	public void move(){
		System.out.println(name + " moves like a "+species );
	}
	
	public void makeSound(){
		System.out.println(name + " makes a "+species + " sound");
	}
	
	private void sleepSafe(){
		System.out.println(name + " is sleeping safely");
	}
	
	protected void napSafe(){
		System.out.println(name + " is napping safely");
	}
	public String toString(){
		String output = "Animal { ";
		output += "species: "+ species + ", ";
		output += "name: "+ name + ", ";
		output += "hasFur: "+ hasFur + ", ";
		output += "numLegs: "+ numLegs + ", ";
		output += " }";
		return output;
	}
	public static void main(String[] args) {
		Animal mys = new Animal("Mystery");
		mys.move();
		mys.makeSound();
		mys.makeSound();
		mys.move();
		System.out.println(mys);
	}
	
}
class Snake extends Animal	{
	
	private boolean isPoisonous;
	private String pattern;
	
	public Snake(String name) {
		super(name, "Snake", 0, false);
		this.isPoisonous = true;
		pattern = "No description";
	}
	public Snake(String name, boolean isPoisonous) {
		super(name, "Snake", 0, false);
		this.isPoisonous = isPoisonous;
		pattern = "No description";
	}
	
	public boolean getisPoisonous() {
		return isPoisonous;
	}
	public void setisPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String toString() {
		String output = super.toString();
		output += "isPoisonous: " + isPoisonous + ", ";
        output += "pattern: " + pattern + " }";
        return output;
	}
	public void makeSound() {
		System.out.println(getName() + " hisses");
	}
	public static void main(String[] args) {
		Snake mySnake = new Snake("Serpent");
		mySnake.move();
		mySnake.makeSound();
		mySnake.makeSound();
		mySnake.move();
		System.out.println(mySnake);
	}
	
}
