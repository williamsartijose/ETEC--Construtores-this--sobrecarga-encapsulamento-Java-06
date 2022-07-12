package ExemploConstrutores.application;

import java.util.Locale;
import java.util.Scanner;

import ExemploConstrutores.entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity); // criar chamando meu Construtores
		
		System.out.println();
		System.out.println("constructor data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		//product.name = "computer"; The field Product.name is not visible por causa do PRIVATE
        //Precisa criar o metodo Setname alterar o atributo
		product.setName("computer");
		//System.out.println("Updated name: "+ product.name);The field Product.name is not visible
		//Precisa criar o metodo getName para acessar o atributo
		System.out.println("Updated name: "+ product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		product.setQuantity(20);
		System.out.println("Update quantity: " + product.getquantity());
		sc.close();
	}
}