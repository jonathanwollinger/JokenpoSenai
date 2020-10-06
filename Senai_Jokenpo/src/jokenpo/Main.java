package jokenpo;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String args[]) {
		System.out.println("..... JOGO JOKENPO .....");

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nDigite o nome do jogador: ");
		String nome1 = scanner.nextLine();
		Jogador jogador1 = new Jogador(nome1, 0);

		Jogador jogador2 = new Jogador("Computador", 0);

		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println("\nBem Vindo ao jogo " + jogador1.getNome() + "!!!");
                System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
                System.out.println("\nREGRA: O Jogador que chegar a 3 vit�rias primeiro sera o grande vencedor.");
                System.out.println("\nBOA SORTE!!!");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println("\nDigite sua jogada entre 0, 1 e 2\nsendo: ");
		System.out.println("\nPEDRA = 0");
		System.out.println("PAPEL = 1");
		System.out.println("TESOURA = 2");

		do {
			
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
			System.out.print("\n" + jogador1.getNome() + ", digite sua jogada: ");
			int elemento1 = scanner.nextInt();
			Jogada jogada1 = new Jogada(elemento1);
			jogada1.validarJogada(elemento1);
			System.out.println("\nJO");
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("ERRO");
				}
			}
			System.out.println("KEN");
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("ERRO");
				}
			}
			System.out.println("P�!!!");
			
			jogador1.retorno(elemento1);

			Random aleatorio = new Random();
			int elemento2 = aleatorio.nextInt(2);
			Jogada jogada2 = new Jogada(elemento2);
			jogador2.retorno(elemento2);

			switch (jogada1.getElemento()) {
			case 0:
				switch (jogada2.getElemento()) {
				case 0:
					System.out.println("\nEmpate!");
					break;
				case 1:
					System.out.println();
					System.out.println("\n" + jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println("\n" + jogador2.getNome() + " possui " + jogador2.getVitorias() + " vit�rias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vit�rias.");
					break;
				case 2:
					System.out.println();
					System.out.println("\n" + jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println("\n" + jogador1.getNome() + " possui " + jogador1.getVitorias() + " vit�rias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vit�rias.");
					break;
				}
				break;
			case 1:
				switch (jogada2.getElemento()) {
				case 0:
					System.out.println("\n" + jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println("\n" + jogador1.getNome() + " possui " + jogador1.getVitorias() + " vit�rias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vit�rias.");
					break;
				case 1:
					System.out.println("\nEmpate!");
					break;
				case 2:
					System.out.println("\n" + jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println("\n" + jogador2.getNome() + " possui " + jogador2.getVitorias() + " vit�rias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vit�rias.");
					break;
				}
				break;
			case 2:
				switch (jogada2.getElemento()) {
				case 0:
					System.out.println("\n" + jogador2.getNome() + " ganhou essa rodada!");
					jogador2.setVitorias(jogador2.getVitorias() + 1);
					System.out.println("\n" + jogador2.getNome() + " possui " + jogador2.getVitorias() + " vit�rias.");
					System.out.println(jogador1.getNome() + " possui " + jogador1.getVitorias() + " vit�rias.");
					break;
				case 1:
					System.out.println("\n" + jogador1.getNome() + " ganhou essa rodada!");
					jogador1.setVitorias(jogador1.getVitorias() + 1);
					System.out.println("\n" + jogador1.getNome() + " possui " + jogador1.getVitorias() + " vit�rias.");
					System.out.println(jogador2.getNome() + " possui " + jogador2.getVitorias() + " vit�rias.");
					break;
				case 2:
					System.out.println("\nEmpate!");
					break;
				}
				break;
			}

		} while (jogador1.getVitorias() < 3 && jogador2.getVitorias() < 3);
		if (jogador1.getVitorias() == 3) {
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
			System.out.println("\nPARAB�NS " + jogador1.getNome() + "!!!\nVoc� � o grande vencedor!");
		}
		if (jogador2.getVitorias() == 3) {
			System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
			System.out.println("\n" + jogador2.getNome() + " � o grande vencedor!");
		}
	}
}
