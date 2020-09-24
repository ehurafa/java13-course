package controle;

import java.util.Scanner;

public class IF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.print("Aprovado!");
			System.out.print("Parabéns!");
		}
		
		if(media < 7.0 && media >= 4.5)  // sem bloco
			System.out.print("Recuperação!");			
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if(criterioReprovacao) {
			System.out.print("Reprovado!");		
		}
			
		
		entrada.close();
		
	}

}
