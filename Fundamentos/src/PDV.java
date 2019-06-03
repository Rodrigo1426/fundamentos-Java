import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;

public class PDV {

	double valor;
	double desconto;
	double troco;
	
	public static void main(String[] args) {
		// Date -> trabalhar com data
		Date data = new Date();
		//formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(formatador.format(data));
		System.out.println("================");
		System.out.println("======PDV=======");
		System.out.println("================");
		System.out.println("");
		System.out.println("Valor total: ");
		System.out.println("Desconto em %: ");
		double calcular = leia.nextLine();
		System.out.println("Total com desconto: ");
		System.out.println("____________________________");
		System.out.println("");
		System.out.println("Valor pago: ");
		System.out.println("Troco: ");
	}
	
	private static void calcular()
	{
		desconto = valor / 100;
		
		
	}
	
	
}
