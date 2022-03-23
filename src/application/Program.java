package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) throws DomainException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		try {
		System.out.print("Entre com os dados da conta");
		int number = sc.nextInt();
		System.out.print("Titular");
		String hoder = sc.next();
		System.out.print("balanço inicial");
		double initialBalance = sc.nextDouble();
		System.out.print("limite de saque");
		double withdrawLimit = sc.nextDouble();
		
		Account account= new Account(number,hoder,initialBalance,withdrawLimit);
		
		System.out.print("Entre com o valor de saque: ");
		double amount = sc.nextDouble();
		
		account.withdraw(amount);
		System.out.println("New balance: " + account.getBalance());
		}
		catch(InputMismatchException e){
			System.out.println("Entrecom o valor adequado no campo");
			
		}
		catch(DomainException e) {
			System.out.println("ERRO: " + e);
		}

	}

}
