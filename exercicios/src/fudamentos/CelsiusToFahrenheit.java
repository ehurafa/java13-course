package fudamentos;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = ( celsius - 32) / 1.8;
		
		System.out.print("Valor em Farenheit: " + conversao);
		
		scanner.close();
	}
}
