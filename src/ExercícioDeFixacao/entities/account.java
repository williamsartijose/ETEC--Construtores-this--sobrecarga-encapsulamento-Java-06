package ExercícioDeFixacao.entities;
public class account {
	//Atributo do Objeto numero,suporte, saldo
		private int number;
		private String holder;
		private double balance;
	
	//Criando o Construtor
	public  account(int number, String holder) { //paramentro do metodo menos o saldo balace
		this.number = number; //A this palavra-chave se refere ao objeto atual em um método ou construtor.
		this.holder = holder;
		//this.balance = balance; //o saldo da conta não pode ser alterado livremente.
	}
	
	public account(int number, String holder, double initialDeposit) {
	this.number = number;
	this.holder = holder;
	deposit(initialDeposit);
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	

	public String toString() {
		return "Account" 
	                + number
	                + ", Holder " 
	                + holder
	                + " , Balance: $ "
				    + String.format("%.2f", balance);
	}
}