package controle;

import java.util.Scanner;

public class IF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.print("Aprovado!");
			System.out.print("Parab�ns!");
		}
		
		if(media < 7.0 && media >= 4.5)  // sem bloco
			System.out.print("Recupera��o!");			
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if(criterioReprovacao) {
			System.out.print("Reprovado!");		
		}
			
		
		entrada.close();
		
	}

}
