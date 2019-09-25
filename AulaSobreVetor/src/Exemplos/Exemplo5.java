package Exemplos;

import java.util.Arrays;

public class Exemplo5 {

	public static void main(String[] args) 
	{
		Integer v[] = new Integer[30];
		
		Arrays.fill(v, 0);
		
		for (Integer valor : v) 
		{
			System.out.println(valor);
		}
	}

}
