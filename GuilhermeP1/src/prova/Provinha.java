package prova;

import java.util.Scanner;

public class Provinha {

	
	public static void main(String[] args) 
	{
		Scanner auxLeitura = new Scanner(System.in);
		String  modeloC [] = new String[5];
		Double  precoC  [] = new Double[5];
		
		
		for (int i = 0; i < precoC.length; i++) 
		{
			
			System.out.println("Digite um modelo de Celular: ");
			modeloC[i] = auxLeitura.next();
			System.out.println("Digite o pre�o: ");
			precoC[i] = auxLeitura.nextDouble();
			
		}
		
		System.out.println("\nModelos: ");
		for (int i = 0; i < modeloC.length; i++) 
		{
			System.out.print(modeloC[i] + "\t");
		}
		
		System.out.println("\nPre�os: ");
		for (int i = 0; i < precoC.length; i++) 
		{
			System.out.print(precoC[i] + "\t");
		}
		
		Double media = 0.0;
		
		for (Double aux : precoC) 
		{
			media+= aux;
		}
		System.out.println("\nA m�dia �: " + media / precoC.length);
		
		int maior = 0;
		for (int i = 0; i < precoC.length; i++) 
		{
			if (precoC[i] > precoC[maior]) 
			{
				maior = i;
			}
		}
		System.out.println("\nO modelo mais caro �: " + precoC[maior]);
		

		for (int i = 0; i < precoC.length; i++) 
		{
			if (precoC[i] < media) 
			{
				System.out.println("Pre�os abaixo da m�dia: " + precoC[i] + "\tModelo: " + modeloC[i]);
			}
			
		}
		

	}

}
