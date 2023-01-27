package org.lessons.java.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String NomePropietario;
		float denaro;

		Scanner s = new Scanner(System.in);

		System.out.print("inserisca il suo nome: ");
		NomePropietario = s.nextLine();

		Conto c = new Conto(NomePropietario);

		System.out.println("nome del correntista: " + NomePropietario);
		System.out.println("conto del correntista: " + c.numeroConto);
		System.out.println("saldo: " + c.saldo);

		String sceltaUser = s.nextLine();
		s.nextLine();

		while (!sceltaUser.equals("chiudi")) {
			System.out.println("Cosa vuoi fare? scegli tra versamento, prelievo o chiudi");
			sceltaUser = s.nextLine();

			if (sceltaUser.equals("versamento")) {
				System.out.println("Quanto vuoi versare?");
				denaro = s.nextFloat();
				s.nextLine();
				c.versamento(denaro);
				System.out.println("saldo: " + c.saldo);
			} else if (sceltaUser.equals("prelievo")) {
				System.out.println("Quanto vuoi prelevare?");
				denaro = s.nextFloat();
				s.nextLine();
				if (denaro > c.saldo) {
					System.out.println("il suo saldo non è sufficente!");
				} else {
					c.prelievo(denaro);
					System.out.println("saldo: " + c.saldo);

				}
			}

		}
		System.out.println("Grazie e arrivederci!");

		s.close();

	}

}
