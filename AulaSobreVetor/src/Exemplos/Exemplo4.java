package Exemplos;

import java.util.Arrays;

public class Exemplo4 {

	public static void main(String[] args) 
	{
		Integer vet [] = {3, 7, 6, 1, 9, 4, 2};
		Integer p =  Arrays.binarySearch(vet, 1);
		
		for(Integer v : vet)
		{
			System.out.print(v + " ");
		}
		System.out.println("");
		System.out.println("Encontrei o valor na posição " + p);
 	}

}
