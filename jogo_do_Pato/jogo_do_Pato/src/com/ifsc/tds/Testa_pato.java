package com.ifsc.tds;

import java.util.Scanner;

public class Testa_pato {

	public static void main(String[] args) {
		Pato patoino = new Pato();
		PatoVermelho verme = new PatoVermelho();
		PatoReal rel = new PatoReal();
		PatoBorracha borro = new PatoBorracha();
		PatoMadeira madera = new PatoMadeira();
		
		patoino.Display();
		patoino.Quack();
		patoino.Nada();
		patoino.voar();
		
		rel.Display3();
		rel.Quack3();
		rel.Nada();
		rel.voar();
		
		verme.Display2();
		verme.Quack2();
		verme.Nada();
		verme.voar();
		
		borro.boia();
		
		madera.madera();
	}
}
