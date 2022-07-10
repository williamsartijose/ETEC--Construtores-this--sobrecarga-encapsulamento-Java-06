package ExemploConstrutores.entities;
public class Product {
	//Atributo do Objeto name,price, quantity
	public String name;
	public double price;
	public int quantity;
	
	//Criando o Construtor
	public  Product(String name, double price, int quantity) { //paramentro do metodo 
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
	                + String.format("%.2f", price) 
	                + ", " 
	                + quantity 
	                + " units, Total: $ "
				    + String.format("%.2f", totalValueInStock());
	}
}