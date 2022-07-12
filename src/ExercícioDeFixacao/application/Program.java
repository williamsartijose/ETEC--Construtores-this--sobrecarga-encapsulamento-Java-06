

package ExercícioDeFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import ExercícioDeFixacao.entities.account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		account ac;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			ac = new account(number, holder, initialDeposit);

		}

		else {
			ac = new account(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(ac);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		ac.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(ac);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		ac.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(ac);

		sc.close();
	}
}