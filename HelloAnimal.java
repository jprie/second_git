public class HelloWorld {

public static void main(String[] args) {
	
				System.out.println("Hello Animal");

				var animals = { new Cat("Mutzi"), new Dog("Ami") };

				for (var animal : animals) {
					System.out.println(animal.getName());
				
				}

}
