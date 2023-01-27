package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, descrizione;
		float prezzo;

		Scanner s = new Scanner(System.in);

		System.out.print("inserisci il nome del prodotto: ");
		nome = s.nextLine();

		System.out.print("inserisci la descrizione del prodotto: ");
		descrizione = s.nextLine();

		System.out.print("inserisci il prezzo del prodotto: ");
		prezzo = s.nextFloat();

		Prodotto p = new Prodotto(nome, descrizione, prezzo);

		System.out.println("il nome del prodotto è: " + nome);
		System.out.println("il nome commerciale  del prodotto è: " + nome + "-" + p.codice);
		System.out.println("il prezzo del prodotto è: " + prezzo + "€");
		System.out.println("il prezzo compreso di iva è: " + p.prezzoConIva() + "€");

		s.close();

	}

}
