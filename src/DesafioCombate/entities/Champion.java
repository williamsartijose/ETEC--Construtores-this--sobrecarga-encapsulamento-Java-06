package DesafioCombate.entities;

public class Champion {
	// Atributo do Objeto nome,vida, ataca,armadura
	private String name;
	private int life;
	private int attack;
	private int armor;

	// Criando o Construtor
	public Champion(String name, int life, int attack, int armor) { // paramentro do metodo menos o saldo balace
		this.name = name; // A this palavra-chave se refere ao objeto atual em um método ou construtor.
		this.life = life;// sobre o This https://www.w3schools.com/java/ref_keyword_this.asp
		this.attack = attack;
		this.armor = armor;
	}

	// Método getters e setters NAME

	public String getName() { // método get para obter acesso ao atributo
		return name;
	}

	public void setName(String name) {// método set alterar um atributo
		this.name = name;
	}

	// Método getters e setters LIFE

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	// Método getters e setters attack

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	// Método getters e setters Armor

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		if (armor >= other.getAttack()) {
			life -= 1;
		} else {
			life -= (other.getAttack() - armor);
		}
	}

	public String status() {

		if (life <= 0) {
			return name + ": You are dead";
		} else {
			return name + ":" + life + " de vida";
		}

	}
}
