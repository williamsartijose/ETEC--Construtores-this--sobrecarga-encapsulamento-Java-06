package ExemploW3schools.entities;

//Cria uma classe principal

public class Main {
	
	int x; //  Cria um atributo de classe

// Crie um construtor de classe para a classe Main
	public Main() {
		x = 5; // Defina o valor inicial para o atributo de classe x
	}

	public static void main(String[] args) {
		Main myObj = new Main(); // Cria um objeto da classe Main (Isto chamará o construtor)
		System.out.println(myObj.x); //Imprima o valor de x
	}
}

//https://www.w3schools.com/java/java_constructors.asp