package com.fundatec.exercicios_prova.questao07;

public class Main {
	public static void main(String args[]) {
		GeradorDeMensagens gerador = new GeradorDeMensagens();
		
		Segunda seg = new Segunda();
		gerador.geraMensagem(seg);
	}
}
