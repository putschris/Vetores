package Exemplos;

public class Exemplo2 {

	public static void main(String[] args) 
	{
		String  mes [] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Set", "Out", "Nov", "Dez"};
		Integer tot [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < mes.length; i++) 
		{
			System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias ao todo");
		}
		

	}

}
