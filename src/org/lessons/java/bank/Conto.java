package org.lessons.java.bank;

import java.util.Random;

public class Conto {

	int numeroConto;
	String NomePropietario;
	int saldo;

	public Conto(String nomePropietario) {
		super();
		Random r = new Random();
		numeroConto = r.nextInt(1001);
		NomePropietario = nomePropietario;
		this.saldo = 0;
	}

	void versamento(float denaro) {
		this.saldo += denaro;
	}

	void prelievo(float denaro) {
		this.saldo -= denaro;
	}

}
