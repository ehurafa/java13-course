package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Informa��es do funcion�rio
		
		// Tipos num�ricos
		byte anosDeEmpresa = 26;
		short numeroDeVoos = 542;
		int id = 56256;
		long pontosAcumulados = 3_233_568_559L;
		
		//Tipos numericos reais 
		float salario = 11_458.69F;
		double vendasAcumuladas = 2_991_797_103.03;
		
		//Tipos booleanos 
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 356);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario );
		
		System.out.println("F�rias? " + estaDeFerias);
		
		System.out.println("Status : " + status);
	}

}
