package ExemploConstrutores.entities;
public class Product {
	//Atributo do Objeto name,price, quantity
	private String name;
	private double price;
	private int quantity;
	
	//Criando o Construtor
	public  Product(String name, double price, int quantity) { //paramentro do metodo 
		this.name = name; //A this palavra-chave se refere ao objeto atual em um método ou construtor.
		this.price = price;// sobre o This https://www.w3schools.com/java/ref_keyword_this.asp
		this.quantity = quantity;
	}
	
	
//	Proposta de melhoria
//	• Vamos criar um construtor opcional, o qual recebe apenas nome e
//	preço do produto. A quantidade em estoque deste novo produto, por
//	padrão, deverá então ser iniciada com o valor zero. • Nota: é possível também 
//	incluir um construtor padrão
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public void  setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getquantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
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