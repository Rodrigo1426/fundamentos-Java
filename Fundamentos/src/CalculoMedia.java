import java.text.DecimalFormat; 
import java.util.Locale; 
import java.util.Scanner;

public class CalculoMedia {
	public static void main (String[] args)
	{
		double nota1, nota2 , media;
		System.out.println("C�lculo da M�dia");
		//criando um objeto para entrada de dados
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.ENGLISH);
		//criando um objeto para formatar resultado
		DecimalFormat formatador = new DecimalFormat("#0.0");
		System.out.println("Digite a nota1");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a nota2");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2)/2;
		System.out.println("Media:" + formatador.format(media));
	}
}
