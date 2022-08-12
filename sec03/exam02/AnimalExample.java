package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//매개변수의 자동 타입 변환
		anmalSound(new Dog());
		anmalSound(new Cat());

	}
	
	public static void anmalSound(Animal animal) {
		animal.sound();
	}

}
