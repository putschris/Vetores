package Exemplos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exemplo3 {

	public static void main(String[] args) 
	{
		Double v [] = {3.5, 2.75, 9.0, -4.5};
		
		Arrays.sort(v);
		for (Double valor : v) 
		{
			System.out.println("O valor da posição " + v.length + " é " + valor);
		}
	}

}
