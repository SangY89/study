package Quiz;

abstract class Character {
	String Charactername;
	void Charactername () {
		
	}
	
	abstract void makeSound();
	
	static void makeAnimalSound() {
		
	}

}

class Chunsik extends Character {
	Chunsik(String Charactername) {
		this.Charactername = Charactername;
	}
	@Override
	void makeSound() {
		System.out.println("으아앙!");
	}
	void printName() {
		System.err.println("춘식!");
	}
}

class Lion extends Character {

	Lion(String Charactername) {
		this.Charactername = Charactername;
	}

	@Override
	void makeSound() {
		System.out.println("크아아앙!");
	}
	void printName() {
		System.out.println("사자!");
	}
}



public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
