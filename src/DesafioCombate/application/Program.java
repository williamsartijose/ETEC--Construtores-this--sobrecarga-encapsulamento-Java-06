
package DesafioCombate.application;

import java.util.Locale;
import java.util.Scanner;

import DesafioCombate.entities.Champion;
import ExercícioDeFixacao.entities.account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Dados do primeiro campeão:

		System.out.println("Digite os dados do primeiro campeão:  ");
		System.out.println();
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		sc.nextLine();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		sc.nextLine();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();

		Champion champion1 = new Champion(name, life, attack, armor);

		System.out.println();

		// Dados do segundo campeão:

		System.out.println("Digite os dados do segundo campeão: ");
		System.out.println();
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		sc.nextLine();

		Champion champion2 = new Champion(name2, life2, attack2, armor2);

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);

			System.out.println();
			System.out.println("Resultado do turno " + (i + 1) + ": ");
			System.out.println(champion1.status());
			System.out.println(champion2.status() + "\n");

			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				break;
			}

		}

		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
