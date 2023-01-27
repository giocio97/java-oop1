package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	int codice;
	String nome;
	String descrizione;
	float prezzo;
	float iva;

	public Prodotto(String nome, String descrizione, float prezzo) {
		super();
		Random r = new Random();
		codice = r.nextInt(999999);
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = 22;

	}

	float prezzoConIva() {
		float prezzoConIva = ((prezzo * iva) / 100) + prezzo;
		return prezzoConIva;
	}

}
