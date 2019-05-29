import java.text.DecimalFormat; 
import java.util.Locale; 
import java.util.Scanner;

public class CalculadoraMC {
	public static void main (String[] args)
		{
		//criando um objeto para entrada de dados
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.ENGLISH);
		//criando um objeto para formatar resultado
		DecimalFormat formatador = new DecimalFormat("#0.00");
		double peso, altura, imc;
		System.out.println("==============");
		System.out.println("Cálculo da IMC");
		System.out.println("==============");
		System.out.println("Digite o seu peso: ");
		peso = leia.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura = leia.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		System.out.println("IMC:" + formatador.format(imc));
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		}
		
		else if (imc >= 18.5 && imc <25)
		{
			System.out.println("Peso normal");
		}
		
		else if (imc >= 25 && imc <30)
		{
			System.out.println("Acima do peso");
		}
		
		else 
		{
			System.out.println("Obesité morbité");
		}
		
		leia.close();
	}

}