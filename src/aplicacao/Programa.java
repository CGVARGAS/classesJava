package aplicacao;

import java.util.Scanner;
import entidade.Bola;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Modelagem de Bolas\n");
		System.out.print("==================\n");
		System.out.print("Cor: ");
		String cor = sc.nextLine();
		System.out.print("Raio: ");
		double raio = sc.nextDouble();
		sc.nextLine();
		System.out.print("Material: ");
		String material = sc.nextLine();
		
		Bola bola = new Bola(cor, raio, material);
		
		System.out.println(bola);
		
		System.out.print("Deseja mudar a cor da bola(s/n)? ");
		char ch = sc.next().charAt(0);
		if(ch == 's') {
			sc.nextLine(); // Consumir a nova linha pendente
			System.out.println("Qual a nova cor: ");
			String novaCor = sc.nextLine();
			bola.trocaCor(novaCor);	
		}
		System.out.println(bola);
		sc.close();
	}

}
